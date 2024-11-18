# Final Project Mobile Testing
Final Project for Automation Testing with Katalon Studio in TAK as Learning Partner

## Informasi Dasar
Mobile Testing (Todo) adalah sebuah Final Project dari `Tes Aplikasi Kamu` dengan topik `Automation Mobile Testing with Katalon`, Aplikasi berfokus pada bagimana cara kerja Aplikasi dengan melakukan testing pada semua fitur, yang dibuat oleh

Nama		                 : `Mohammad Nurdiansyah`\
Final Project Website    : [`Repository FP Website`](https://github.com/nurdinsh/katalon-taskfinal-MohammadNurdiansyah)\
Final Project Mobile     : [`Repository FP Mobile`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah)\
Final Project API        : [`Repository FP API`](https://github.com/nurdinsh/katalon-taskapi-MohammadNurdiansyah)

---

# Panduan Penggunaan Aplikasi

## Requirement yang harus disipkan sebelum running aplikasi ini adalah :
- Menggunakan `Bahasa Groovy` based `Katalon Studio`
- Testing dilakukan pada Website [`Todo`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah/tree/main/APK)
- Testing dilakukan dengan Emulator [`Vysor`](https://www.vysor.io/) dengan Device `Galaxy Tab A9` Android 14


## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `13 Test Case` dengan hasil :
```
13 Passed
0 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `100% Passed`

## IF ELSE Condition
Pada testing ini dimasukan test case yang berisi `IF ELSE CONDITION`, yaitu pada `Test Case Add Task`
```
if (PetunjukWaktu == 'AM') {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - AM'), 0, FailureHandling.STOP_ON_FAILURE)
	} else {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - PM'), 0, FailureHandling.STOP_ON_FAILURE)
}
```

## Data Driven Test
Pada testing ini dimasukan juga test case yang berisi `Data Driven Test` yaitu pada `Test Case Add Task`, dan `Test Case Edit Task`\
Dokument DDT dapat diakses pada [`DDT Test File`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah/tree/main/Data%20Files/RawData)\
Konsep DDT adalah memungkinkan untuk mengisi nilai vaiabel dari data yang bersumber pada Data File, tanpa harus di input manual satu-satu\
Data File dapat di generate dari sumber external seperti `DBMS` ataupun file seperti `.xls`, `.csv` pada kasus ini digunakan data dari File Excel `TS01_Add Task`,`TS02_Edit Task`.

Pada `TS01_Add Task` dipanggil `Add Task`, dan `TS02_Edit Task` dipanggil `Edit Task`, lalu dilakukan `Data Binding`, untuk mengkoneksikan antara `Variabel` dalam Test Case dengan `Column` pada Data File. Sehingga pada pelaksanaan testing, column dalam Data File dapat di jalankan secara otomatis

## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS01_Add Task
TS02_Edit Task
TS03_Catagory
TS04_Delete
```


[LinkedIn](https://www.linkedin.com/in/mohammad-nurdiansyah-099b31151/) | [GitHub](https://github.com/nurdinsh)
