// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public enum EnumPharmaProfessionals
{
	Pharmacist(new java.lang.String[][] { new java.lang.String[] { "en_US", "Pharmacist" } }),
	Chemist(new java.lang.String[][] { new java.lang.String[] { "en_US", "Chemist" } }),
	DoctorOfPharmacy(new java.lang.String[][] { new java.lang.String[] { "en_US", "DoctorOfPharmacy" } }),
	Druggist(new java.lang.String[][] { new java.lang.String[] { "en_US", "Druggist" } }),
	Apothecary(new java.lang.String[][] { new java.lang.String[] { "en_US", "Apothecary" } }),
	Doctor(new java.lang.String[][] { new java.lang.String[] { "en_US", "Doctor" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private EnumPharmaProfessionals(java.lang.String[][] captionStrings)
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