// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum EnumNameOfTheHospital
{
	Sultan_Al_Olama_Medical_Center(new java.lang.String[][] { new java.lang.String[] { "en_US", "Sultan Al Olama Medical Center" }, new java.lang.String[] { "ar_AE", "مركز سلطان العلماء الطبي" } }),
	Saudi_German_Hospital_Dubai(new java.lang.String[][] { new java.lang.String[] { "en_US", "Saudi German Hospital Dubai" }, new java.lang.String[] { "ar_AE", "المستشفى السعودي الألماني دبي" } }),
	Rashid_Hospital(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rashid Hospital" }, new java.lang.String[] { "ar_AE", "مستشفى راشد" } }),
	Al_Jalila_Children_s_Specialty_Hospital(new java.lang.String[][] { new java.lang.String[] { "en_US", "Al Jalila Children's Specialty Hospital" }, new java.lang.String[] { "ar_AE", "مستشفى الجليلة التخصصي للأطفال" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private EnumNameOfTheHospital(java.lang.String[][] captionStrings)
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