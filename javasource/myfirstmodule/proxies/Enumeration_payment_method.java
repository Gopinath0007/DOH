// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Enumeration_payment_method
{
	Credit_Card(new java.lang.String[][] { new java.lang.String[] { "en_US", "Credit Card" }, new java.lang.String[] { "ar_AE", "بطاقة ائتمان" } }),
	Debit_Card(new java.lang.String[][] { new java.lang.String[] { "en_US", "Debit Card" }, new java.lang.String[] { "ar_AE", "بطاقة ائتمان" } }),
	UPI(new java.lang.String[][] { new java.lang.String[] { "en_US", "UPI" }, new java.lang.String[] { "ar_AE", "UPI" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enumeration_payment_method(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
