package com.example.chapter3.data

import android.os.Parcel
import android.os.Parcelable

data class MahasiswaParcel(
    val nama: String, val nim:String,
    val uas: Int, val uts: Int,
    val tugas: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(nim)
        parcel.writeInt(uas)
        parcel.writeInt(uts)
        parcel.writeInt(tugas)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MahasiswaParcel> {
        override fun createFromParcel(parcel: Parcel): MahasiswaParcel {
            return MahasiswaParcel(parcel)
        }

        override fun newArray(size: Int): Array<MahasiswaParcel?> {
            return arrayOfNulls(size)
        }
    }
}
