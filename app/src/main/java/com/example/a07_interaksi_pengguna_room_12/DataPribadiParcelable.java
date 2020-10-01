package com.example.a07_interaksi_pengguna_room_12;

import android.os.Parcel;
import android.os.Parcelable;

public class DataPribadiParcelable implements Parcelable {

    private String nama, fakultas, prodi, statusPendaftaran, alasan, nik, prestasi, tempatLahir, jenisKelamin, kewarganegaraan;
    private String agama, alamat, rt, rw, kodePos, provinsi, kota, noHp, noTelp, email;

    public String getNama(){return nama;}
    public String getFakultas(){return fakultas;}
    public String getProdi(){return prodi;}
    public String getStatusPendaftaran(){return statusPendaftaran;}
    public String getAlasan(){return alasan;}
    public String getNik(){return nik;}
    public String getPrestasi(){return prestasi;}
    public String getTempatLahir(){return tempatLahir;}
    public String getJenisKelamin(){return jenisKelamin;}
    public String getKewarganegaraan(){return kewarganegaraan;}
    public String getAgama(){return agama;}
    public String getAlamat(){return alamat;}
    public String getRt(){return rt;}
    public String getRw(){return rw;}
    public String getKodePos(){return kodePos;}
    public String getProvinsi(){return provinsi;}
    public String getKota(){return kota;}
    public String getNoHp(){return noHp;}
    public String getNoTelp(){return noTelp;}
    public String getEmail(){return email;}


    public DataPribadiParcelable(String nama, String fakultas, String prodi, String statusPendaftaran,
    String alasan, String nik, String prestasi, String tempatLahir, String jenisKelamin, String kewarganegaraan, String agama,
    String alamat, String rt, String rw, String kodePos, String provinsi, String kota, String noHp, String noTelp, String email){
        this.nama=nama;
        this.fakultas=fakultas;
        this.prodi=prodi;
        this.statusPendaftaran=statusPendaftaran;
        this.alasan=alasan;
        this.nik=nik;
        this.prestasi=prestasi;
        this.tempatLahir =tempatLahir;
        this.jenisKelamin =jenisKelamin;
        this.kewarganegaraan=kewarganegaraan;
        this.agama=agama;
        this.alamat=alamat;
        this.rt=rt;
        this.rw=rw;
        this.kodePos=kodePos;
        this.provinsi=provinsi;
        this.kota=kota;
        this.noHp=noHp;
        this.noTelp=noTelp;
        this.email=email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString((fakultas));
        parcel.writeString((prodi));
        parcel.writeString((statusPendaftaran));
        parcel.writeString((alasan));
        parcel.writeString((nik));
        parcel.writeString((prestasi));
        parcel.writeString((tempatLahir));
        parcel.writeString((jenisKelamin));
        parcel.writeString((kewarganegaraan));
        parcel.writeString((agama));
        parcel.writeString((alamat));
        parcel.writeString((rt));
        parcel.writeString((rw));
        parcel.writeString((kodePos));
        parcel.writeString((provinsi));
        parcel.writeString((kota));
        parcel.writeString((noHp));
        parcel.writeString((noTelp));
        parcel.writeString((email));
    }

    public DataPribadiParcelable(Parcel parcel){
        nama=parcel.readString();
        fakultas=parcel.readString();
        prodi=parcel.readString();
        statusPendaftaran=parcel.readString();
        alasan=parcel.readString();
        nik=parcel.readString();
        prestasi=parcel.readString();
        tempatLahir=parcel.readString();
        jenisKelamin =parcel.readString();
        kewarganegaraan=parcel.readString();
        agama=parcel.readString();
        alamat=parcel.readString();
        rt=parcel.readString();
        rw=parcel.readString();
        kodePos=parcel.readString();
        provinsi=parcel.readString();
        kota=parcel.readString();
        noHp=parcel.readString();
        noTelp=parcel.readString();
        email=parcel.readString();

    }

    public static final Parcelable.Creator<DataPribadiParcelable> CREATOR = new Parcelable.Creator<DataPribadiParcelable>() {
        @Override
        public DataPribadiParcelable createFromParcel(Parcel parcel) {
            return new DataPribadiParcelable(parcel);
        }
        @Override
        public DataPribadiParcelable[] newArray(int size) {
            return new DataPribadiParcelable[0];
        }
    };
}
