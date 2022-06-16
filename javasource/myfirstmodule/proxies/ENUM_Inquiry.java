// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum ENUM_Inquiry
{
	Facilities(new java.lang.String[][] { new java.lang.String[] { "en_US", "Facilities" }, new java.lang.String[] { "ar_AE", "خدمات" } }),
	Insurance(new java.lang.String[][] { new java.lang.String[] { "en_US", "Insurance" }, new java.lang.String[] { "ar_AE", "تأمين" } }),
	Professionals(new java.lang.String[][] { new java.lang.String[] { "en_US", "Professionals" }, new java.lang.String[] { "ar_AE", "المهنيين" } }),
	_Public(new java.lang.String[][] { new java.lang.String[] { "en_US", "Public" }, new java.lang.String[] { "ar_AE", "عامة" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Inquiry(java.lang.String[][] captionStrings)
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
