package prog1;
//program Menghitung Nilai rapot
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ProgramNilaiReport
{
public static void main(String [] args)
{
BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

int nilaiUas;
int nilaiUts;
int nilaiTugas;
int nilaiAbsensi;
int ratarata;


System.out.println(" (_*PROGRAM NILAI RAPORT*_)");
System.out.println();

try
{
System.out.println("Nilai Raport yang di bawah 75 Remidi / Gagal");
System.out.println();

//INPUT NYA
System.out.print("-Masukan Nilai UAS : "); //Masukan Nilai UAS
nilaiUas = Integer.parseInt(dataIn.readLine());

System.out.print("-Masukan Nilai UTS : "); //Masukan Nilai UTS
nilaiUts = Integer.parseInt(dataIn.readLine());

System.out.print("-Masukan Nilai Tugas : "); //Masukan Nilai Tugas
nilaiTugas = Integer.parseInt(dataIn.readLine());

System.out.print("-Masukan Nilai Absensi : "); //Masukan Nilai Absensi
nilaiAbsensi = Integer.parseInt(dataIn.readLine());

//proses penghitungannya sebagai berikut
ratarata = ((nilaiUas + nilaiUts + nilaiTugas + nilaiAbsensi)/4);

System.out.println("---------------------------------");
System.out.println();

//menampilkan hasilnya sebagai berikut
System.out.println("------------ Nilai ------------");
System.out.println(" Nilai UAS : " + nilaiUas);
System.out.println(" Nilai UTS : " + nilaiUts);
System.out.println(" Nilai Tugas : " + nilaiTugas);
System.out.println(" Nilai Absensi : " + nilaiAbsensi);
System.out.println();
System.out.println("------- Di rata-ratakan -------");
System.out.println("Nilai Raport : " + ratarata);
System.out.println();
String msg = "Nilai Raport Anda : "+ratarata+".";

JOptionPane.showMessageDialog(null, msg); //Menampilkan Pesan Nilai Raportnya

//kondisi Lulus dan Gagal sebagai berikut 
if (ratarata>=75)
{
System.out.println("Keterangan : (_LULUS_)");
}
else
{
System.out.println("Keterangan : (_GAGAL_)");
}
}
catch(IOException e)
{
System.out.println("Masukan dengan BENAR");
}
}
}