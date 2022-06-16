// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum ENUM_Status
{
	Inprogress(new java.lang.String[][] { new java.lang.String[] { "en_US", "Inprogress" }, new java.lang.String[] { "ar_AE", "في تقدم" } }),
	Closed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Closed" }, new java.lang.String[] { "ar_AE", "مغلق" } }),
	_New(new java.lang.String[][] { new java.lang.String[] { "en_US", "New" }, new java.lang.String[] { "ar_AE", "جديد" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Status(java.lang.String[][] captionStrings)
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