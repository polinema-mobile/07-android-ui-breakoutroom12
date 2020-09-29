package com.example.a07_interaksi_pengguna_room_12;

import android.os.Parcel;
import android.os.Parcelable;

public class DataMahasiswaParcelable implements Parcelable {

    private String nama, nim, tanggalLahir, jenisKelamin, jurusan;

    public DataMahasiswaParcelable(String nama, String nim, String tanggalLahir, String jenisKelamin, String jurusan){
        this.nama=nama;
        this.nim=nim;
        this.tanggalLahir=tanggalLahir;
        this.jenisKelamin=jenisKelamin;
        this.jurusan=jurusan;
    }

    public String getNama(){return nama;}
    public String getNim(){return nim;}
    public String getTanggalLahir(){return tanggalLahir;}
    public String getJenisKelamin(){return jenisKelamin;}
    public String getJurusan(){return jurusan;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(nim);
        parcel.writeString(tanggalLahir);
        parcel.writeString(jenisKelamin);
        parcel.writeString(jurusan);

    }

    public DataMahasiswaParcelable(Parcel parcel){
        nama=parcel.readString();
        nim=parcel.readString();
        tanggalLahir=parcel.readString();
        jenisKelamin=parcel.readString();
        jurusan=parcel.readString();
    }

    public static final Parcelable.Creator<DataMahasiswaParcelable> CREATOR = new Parcelable.Creator<DataMahasiswaParcelable>() {

        @Override
        public DataMahasiswaParcelable createFromParcel(Parcel parcel) {
            return new DataMahasiswaParcelable(parcel);
        }

        @Override
        public DataMahasiswaParcelable[] newArray(int size) {
            return new DataMahasiswaParcelable[0];
        }
    };
}
