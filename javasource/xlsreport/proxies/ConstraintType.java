// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum ConstraintType
{
	Contains(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contains" }, new java.lang.String[] { "ar_AE", "يتضمن" } }),
	StartWith(new java.lang.String[][] { new java.lang.String[] { "en_US", "Start with" }, new java.lang.String[] { "ar_AE", "أبدا ب" } }),
	Greater(new java.lang.String[][] { new java.lang.String[] { "en_US", "Greater" }, new java.lang.String[] { "ar_AE", "أكبر" } }),
	GreaterEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "Greater and equal" }, new java.lang.String[] { "ar_AE", "أكبر ومتساو" } }),
	Equal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Equal" }, new java.lang.String[] { "ar_AE", "متساوي" } }),
	NotEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "NotEqual" }, new java.lang.String[] { "ar_AE", "ليس متساوي" } }),
	SmallerEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "Smaller and equal" }, new java.lang.String[] { "ar_AE", "أصغر ومتساو" } }),
	Smaller(new java.lang.String[][] { new java.lang.String[] { "en_US", "Smaller" }, new java.lang.String[] { "ar_AE", "الأصغر" } }),
	_empty(new java.lang.String[][] { new java.lang.String[] { "en_US", "Empty" }, new java.lang.String[] { "ar_AE", "فارغة" } }),
	NotEmpty(new java.lang.String[][] { new java.lang.String[] { "en_US", "Not empty" }, new java.lang.String[] { "ar_AE", "ليس فارغًا" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ConstraintType(java.lang.String[][] captionStrings)
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
