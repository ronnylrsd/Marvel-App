package br.unicap.c3.pwm.marvel

import android.os.Parcel
import android.os.Parcelable

data class MarvelData(
    val id:Int?,
    val title:String?,
    val locality:String?,
    val power:String?,
    val weakness:String?,
    val overview:String?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(locality)
        parcel.writeString(power)
        parcel.writeString(weakness)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MarvelData> {
        override fun createFromParcel(parcel: Parcel): MarvelData {
            return MarvelData(parcel)
        }

        override fun newArray(size: Int): Array<MarvelData?> {
            return arrayOfNulls(size)
        }
    }


}
