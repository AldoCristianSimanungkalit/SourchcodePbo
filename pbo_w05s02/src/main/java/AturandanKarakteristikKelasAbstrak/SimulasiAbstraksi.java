/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AturandanKarakteristikKelasAbstrak;

/**
 *
 * @author User
 */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret TrukBox, MobilVan dan MotorKurir
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("--------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
        
        System.out.println("--------------------------------");

        MotorKurir supraBapak = new MotorKurir("BK 1621 AB", 1000);
        supraBapak.infoKendaraan();
        supraBapak.angkutBarang("6 Kotak Makanan");
    }

}



/*
* ini pesan langsung pada garis merah dari komentar yang di uncoment 
* "not a statement

';' expected
----
(Alt-Enter shows hints)"

* DAN INI

* pesan eror saat uncomment komentar PERCOBAAN 1 ketika di jalankan atau outputnya "cd D:\STUDY D4 DEL\Semester 3\Pemograman Berorientasi Objek\week 5\Praktikum\w05s02; "JAVA_HOME=C:\\Program Files\\Java\\jdk-23" cmd /c "\"C:\\Program Files\\NetBeans-24\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" \"-Dexec.executable=C:\\Program Files\\Java\\jdk-23\\bin\\java.exe\" -Dexec.mainClass=AturandanKarakteristikKelasAbstrak.SimulasiAbstraksi -Dexec.classpathScope=runtime -Dexec.appArgs= \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-24\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Scanning for projects...

------------------------< com.mycompany:w05s02 >------------------------
Building PBO_W5S2_41425048 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ w05s02 ---
skip non existing resourceDirectory D:\STUDY D4 DEL\Semester 3\Pemograman Berorientasi Objek\week 5\Praktikum\w05s02\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ w05s02 ---
Recompiling the module because of changed source code.
Compiling 7 source files with javac [debug release 23] to target\classes
-------------------------------------------------------------
COMPILATION ERROR : 
-------------------------------------------------------------
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,10] not a statement
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,19] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,39] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,60] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[19,16] '{' expected
5 errors 
-------------------------------------------------------------
------------------------------------------------------------------------
BUILD FAILURE
------------------------------------------------------------------------
Total time:  1.077 s
Finished at: 2026-10-07T14:18:14+07:00
------------------------------------------------------------------------
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project w05s02: Compilation failure: Compilation failure: 
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,10] not a statement
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,19] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,39] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[15,60] ';' expected
AturandanKarakteristikKelasAbstrak/SimulasiAbstraksi.java:[19,16] '{' expected
-> [Help 1]

To see the full stack trace of the errors, re-run Maven with the -e switch.
Re-run Maven using the -X switch to enable full debug logging.

For more information about the errors and possible solutions, please read the following articles:
[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
"
*
*/