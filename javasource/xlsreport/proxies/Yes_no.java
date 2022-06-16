// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum Yes_no
{
	Yes(new java.lang.String[][] { new java.lang.String[] { "en_US", "Yes" }, new java.lang.String[] { "ar_AE", "نعم" } }),
	No(new java.lang.String[][] { new java.lang.String[] { "en_US", "No" }, new java.lang.String[] { "ar_AE", "كلا" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Yes_no(java.lang.String[][] captionStrings)
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