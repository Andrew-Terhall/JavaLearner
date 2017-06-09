

private void handleSendRequest()
{
  String requestURI = jTextFieldReqURI.getText().trim();
  if (!requestURI.isEmpty())
  {
    try
    {
      //Clear response
      handleClearResponse();

      //instantiate client
      HttpClient.client = new HttpClient();
      //Get method type from factory
      HttpMethod method = new
      MethodFactory().getMethod(jComboBoxMethod.getSelectedItem().toString(),
      requestURI);

      //Make http request
      int statusCode = client.executeMethod(method);

      //update view
      jLabelURI.setText(requestURI);
      jLabelResultCode.setText(method.getResponseBodyAsString());

      //we omit the rest of the field updates here, but everything
      //is part of the code listing...
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      //let the user know something went wrong
      handleClearResponse();
      jLabelURI.setText("Error with URI:" + requestURI);
      jTextAreaResBody.setText(ex.getMessage());
    }
  }
}
