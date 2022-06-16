// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public enum Enum_NotificationArea_RenderAs
{
	Info(new java.lang.String[][] { new java.lang.String[] { "en_US", "Info" }, new java.lang.String[] { "ar_AE", "معلومات" } }),
	Warning(new java.lang.String[][] { new java.lang.String[] { "en_US", "Warning" }, new java.lang.String[] { "ar_AE", "تحذير" } }),
	Error(new java.lang.String[][] { new java.lang.String[] { "en_US", "Error" }, new java.lang.String[] { "ar_AE", "خطأ" } }),
	Success(new java.lang.String[][] { new java.lang.String[] { "en_US", "Success" }, new java.lang.String[] { "ar_AE", "نجاح" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_NotificationArea_RenderAs(java.lang.String[][] captionStrings)
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
