// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum EnumStatus
{
	Submitted(new java.lang.String[][] { new java.lang.String[] { "en_US", "Submitted" }, new java.lang.String[] { "ar_AE", "مقدم" } }),
	InProgress(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "قيد العمل" } }),
	DOHOfficerAccept(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "عضو واحد يقبل" } }),
	DOHofficerReturn(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "عضو واحد يرجع" } }),
	DoHReview(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "مراجعة CSD" } }),
	DOHAccept(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "تمت الموافقة على CSD" } }),
	DOHReturn(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "تم إرجاع CSD" } }),
	DOHLegalAccept(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "القبول القانوني لوزارة الصحة" } }),
	DOHLegalReturn(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "الإرجاع القانوني لدائرة الصحة" } }),
	ADPoliceAccept(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "تم قبوله من شرطة أبوظبي" } }),
	ADPoliceReturn(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "تم إعادته من شرطة أبوظبي" } }),
	Approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Approved" }, new java.lang.String[] { "ar_AE", "تمت الموافقة" } }),
	DOJRejected(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rejected" }, new java.lang.String[] { "ar_AE", "رفضه الرئيس" } }),
	DOJReturned(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" }, new java.lang.String[] { "ar_AE", "أرجعه الرئيس" } }),
	Paid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Paid" }, new java.lang.String[] { "ar_AE", "مدفوع" } }),
	Amended(new java.lang.String[][] { new java.lang.String[] { "en_US", "Amended" }, new java.lang.String[] { "ar_AE", "معدل" } }),
	Pending_For_Payment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Pending For Payment" }, new java.lang.String[] { "ar_AE", "معلق للدفع" } }),
	Delivered(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delivered" }, new java.lang.String[] { "ar_AE", "تم التوصيل" } }),
	Rejected(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rejected" }, new java.lang.String[] { "ar_AE", "مرفوض" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private EnumStatus(java.lang.String[][] captionStrings)
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