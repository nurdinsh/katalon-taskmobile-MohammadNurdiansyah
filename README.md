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
Pada pelaksanaan testing dilakukan testing pada `22 Test Case` dengan hasil :
```
22 Passed
0 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `100% Passed`

## IF ELSE Condition
Pada testing ini dimasukan test case yang berisi `IF ELSE CONDITION`, yaitu pada `TC01_Verify Add Task Successfully`,`TC02_Verify Add Task With Date Picker`,`TC03_Verify Add Task With Scroll Years`,`TC04_Verify Add Task with Keyboard time`,`TC05_Verify Add Task and Add Catagory`,`TC06_Verify Add Task Title Blank`,`TC07_Verify Add Task Blank`.
```
if (PetunjukWaktu == 'AM') {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - AM'), 0, FailureHandling.STOP_ON_FAILURE)
	} else {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - PM'), 0, FailureHandling.STOP_ON_FAILURE)
}
```
```
if (day == 'AM') {
    Mobile.tap(findTestObject('Add Task/Time/Keyboard/android.widget.CheckedTextView - AM'), 2, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Add Task/Time/Keyboard/android.widget.CheckedTextView - PM'), 2, FailureHandling.STOP_ON_FAILURE)
}

```
## SWITCH CASE Condition
Pada testing ini dimasukan test case yang berisi `SWITCH CASE CONDITION`, yaitu pada `TC02_Verify Delete Catagory Successuflly`, dan `TC03_Verify Update Catagory Successuflly`.
```
def choiseCatagoryNameDelete = CatagoryNameDelete

switch (choiseCatagoryNameDelete) {
    case choiseCatagoryNameDelete = 'Personal':
        println(choiseCatagoryNameDelete)

        Mobile.tap(findTestObject('Menu/Catagory/Delete/android.widget.Delete Personal'), 0)

        break
    case choiseCatagoryNameDelete = 'Business':
        println(choiseCatagoryNameDelete)

        Mobile.tap(findTestObject('Menu/Catagory/Delete/android.widget.Delete Business'), 0)

        break
    case choiseCatagoryNameDelete = 'Insurance':
        println(choiseCatagoryNameDelete)

        Mobile.tap(findTestObject('Menu/Catagory/Delete/android.widget.Delete Insurance'), 0)

        break
    case choiseCatagoryNameDelete = 'Shopping':
        println(choiseCatagoryNameDelete)

        Mobile.tap(findTestObject('Menu/Catagory/Delete/android.widget.Delete Shopping'), 0)

        break
    case choiseCatagoryNameDelete = 'Banking':
        println(choiseCatagoryNameDelete)

        Mobile.tap(findTestObject('Menu/Catagory/Delete/android.widget.Delete Banking'), 0)
}
```

```
def choiseCatagoryNameEdit = CatagoryNameEdit

switch (choiseCatagoryNameEdit) {
    case choiseCatagoryNameEdit = 'Personal':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Personal'), 2)

        break
    case choiseCatagoryNameEdit = 'Business':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Business'), 2)

        break
    case choiseCatagoryNameEdit = 'Insurance':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Insurance'), 2)

        break
    case choiseCatagoryNameEdit = 'Shopping':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Shopping'), 2)

        break
    case choiseCatagoryNameEdit = 'Banking':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Banking'), 2)
}

```
## LOOP Condition
Pada testing ini dimasukan test case yang berisi `LOOP CONDITION`, yaitu pada `TC02_Verify Add Task With Date Picker`.
```
String cMonth = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Sun, Nov 17'), 2)

String cYear = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Year'), 2)

String eMonth = Month

String eYear = Year

while (!(cMonth.equals(eMonth)) || !(cYear.equals(eYear))) {
    String strDate = Datess

    Mobile.tap(findTestObject('Add Task/Date/android.view.View - Date', [('date') : strDate]), 2)

    Mobile.tap(findTestObject('Add Task/Date/android.widget.RightClickButton'), 2)

    cMonth = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Sun, Nov 17'), 2)

    cYear = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Year'), 2)
}
```


## Data Driven Test
Pada testing ini dimasukan juga test case yang berisi `Data Driven Test` yaitu pada `TC_Add Task`, `TC_Catagory`,`TC_Edit Task`.\
Dokument DDT dapat diakses pada [`DDT Test File`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah/tree/main/Data%20Files/RawData)\
Konsep DDT adalah memungkinkan untuk mengisi nilai vaiabel dari data yang bersumber pada Data File, tanpa harus di input manual satu-satu\
Data File dapat di generate dari sumber external seperti `DBMS` ataupun file seperti `.xls`, `.csv` pada kasus ini digunakan data dari File Excel `TS01_Add Task`,`TS02_Edit Task`.

Pada `TS01_Add Task` dipanggil `Add Task`, `TS03_Catagory` dipanggil `Catagory`,dan `TS02_Edit Task` dipanggil `Edit Task` lalu dilakukan `Data Binding`, untuk mengkoneksikan antara `Variabel` dalam Test Case dengan `Column` pada Data File. Sehingga pada pelaksanaan testing, column dalam Data File dapat di jalankan secara otomatis

## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS01_Add Task
TS02_Edit Task
TS03_Catagory
TS04_Delete
```
## Test Suite Collection
pada pengujian ini juga dibuat `Test Suite Collection` untuk menjalankan semua `Test Suite` dengan Browser yang berbeda-beda
```
TSC01_Fuction
```

[LinkedIn](https://www.linkedin.com/in/mohammad-nurdiansyah-099b31151/) | [GitHub](https://github.com/nurdinsh)
