// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ValidationResult2
{
	NoInputParams(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoInputParams" }, new java.lang.String[] { "nl_NL", "NoInputParams" }, new java.lang.String[] { "en_GB", "NoInputParams" }, new java.lang.String[] { "en_ZA", "NoInputParams" }, new java.lang.String[] { "ar_AE", "لا توجد معلمات إدخال" } }),
	WrongNrOfInputParams(new java.lang.String[][] { new java.lang.String[] { "en_US", "WrongNrOfInputParams" }, new java.lang.String[] { "nl_NL", "WrongNrOfInputParams" }, new java.lang.String[] { "en_GB", "WrongNrOfInputParams" }, new java.lang.String[] { "en_ZA", "WrongNrOfInputParams" }, new java.lang.String[] { "ar_AE", "عدد خاطئ لمعلمات الإدخال" } }),
	WrongReturnType(new java.lang.String[][] { new java.lang.String[] { "en_US", "WrongReturnType" }, new java.lang.String[] { "nl_NL", "WrongReturnType" }, new java.lang.String[] { "en_GB", "WrongReturnType" }, new java.lang.String[] { "en_ZA", "WrongReturnType" }, new java.lang.String[] { "ar_AE", "نوع الإرجاع الخاطئ" } }),
	Valid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Valid" }, new java.lang.String[] { "nl_NL", "Geldig" }, new java.lang.String[] { "en_GB", "Valid" }, new java.lang.String[] { "en_ZA", "Valid" }, new java.lang.String[] { "ar_AE", "صالح" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ValidationResult2(java.lang.String[][] captionStrings)
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