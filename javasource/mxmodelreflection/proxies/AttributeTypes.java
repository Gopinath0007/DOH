// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public enum AttributeTypes
{
	AutoNumber(new java.lang.String[][] { new java.lang.String[] { "en_US", "Auto number" }, new java.lang.String[] { "nl_NL", "Autonummer" }, new java.lang.String[] { "en_GB", "Auto number" }, new java.lang.String[] { "en_ZA", "Auto number" }, new java.lang.String[] { "ar_AE", "رقم تلقائي" } }),
	BooleanType(new java.lang.String[][] { new java.lang.String[] { "en_US", "Boolean" }, new java.lang.String[] { "nl_NL", "Boolean" }, new java.lang.String[] { "en_GB", "Boolean" }, new java.lang.String[] { "en_ZA", "Boolean" }, new java.lang.String[] { "ar_AE", "قيمة منطقية" } }),
	Currency(new java.lang.String[][] { new java.lang.String[] { "en_US", "Currency" }, new java.lang.String[] { "nl_NL", "Currency" }, new java.lang.String[] { "en_GB", "Currency" }, new java.lang.String[] { "en_ZA", "Currency" }, new java.lang.String[] { "ar_AE", "عملة" } }),
	DateTime(new java.lang.String[][] { new java.lang.String[] { "en_US", "DateTime" }, new java.lang.String[] { "nl_NL", "DateTime" }, new java.lang.String[] { "en_GB", "DateTime" }, new java.lang.String[] { "en_ZA", "DateTime" }, new java.lang.String[] { "ar_AE", "التاريخ والوقت" } }),
	EnumType(new java.lang.String[][] { new java.lang.String[] { "en_US", "Enum" }, new java.lang.String[] { "nl_NL", "Enum" }, new java.lang.String[] { "en_GB", "Enum" }, new java.lang.String[] { "en_ZA", "Enum" }, new java.lang.String[] { "ar_AE", "تعداد" } }),
	FloatType(new java.lang.String[][] { new java.lang.String[] { "en_US", "Float" }, new java.lang.String[] { "nl_NL", "Float" }, new java.lang.String[] { "en_GB", "Float" }, new java.lang.String[] { "en_ZA", "Float" }, new java.lang.String[] { "ar_AE", "يطفو" } }),
	HashString(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash string (i.e. passwords)" }, new java.lang.String[] { "nl_NL", "Hash string (bv. wachtwoorden)" }, new java.lang.String[] { "en_GB", "Hash string (i.e. passwords)" }, new java.lang.String[] { "en_ZA", "Hash string (i.e. passwords)" }, new java.lang.String[] { "ar_AE", "سلسلة تجزئة (أي كلمات المرور)" } }),
	IntegerType(new java.lang.String[][] { new java.lang.String[] { "en_US", "Integer" }, new java.lang.String[] { "nl_NL", "Integer" }, new java.lang.String[] { "en_GB", "Integer" }, new java.lang.String[] { "en_ZA", "Integer" }, new java.lang.String[] { "ar_AE", "عدد صحيح" } }),
	LongType(new java.lang.String[][] { new java.lang.String[] { "en_US", "Long" }, new java.lang.String[] { "nl_NL", "Long" }, new java.lang.String[] { "en_GB", "Long" }, new java.lang.String[] { "en_ZA", "Long" }, new java.lang.String[] { "ar_AE", "طويل" } }),
	StringType(new java.lang.String[][] { new java.lang.String[] { "en_US", "String" }, new java.lang.String[] { "nl_NL", "String" }, new java.lang.String[] { "en_GB", "String" }, new java.lang.String[] { "en_ZA", "String" }, new java.lang.String[] { "ar_AE", "سلسلة" } }),
	Decimal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Decimal" }, new java.lang.String[] { "nl_NL", "Decimal" }, new java.lang.String[] { "en_GB", "Decimal" }, new java.lang.String[] { "en_ZA", "Decimal" }, new java.lang.String[] { "ar_AE", "عدد عشري" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AttributeTypes(java.lang.String[][] captionStrings)
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
