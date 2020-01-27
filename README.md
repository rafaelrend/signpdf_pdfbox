# signpdf_pdfbox 

Sign PDF  files using Java and Apache PDF BOX. This project is a simples javax.swing form calling apache PDFBox functions to sign a pdf file.

## Requirements
1. Java JDK
2. NetBeans )
2. keystore file 
3. put your enviroment informations at file  /src/br/com/rendti/forms/FormTeste.java

### /src/br/com/rendti/forms/FormTeste.java (starting from line 82)
```java
        java.security.KeyStore ks  = KeyStore.getInstance("JKS");
        String filePathToStore = "/home/rafael/your_key_file.jks";
        String keystorePasswordCharArray = "123456";
        String passwordForKeyCharArray = "1234";
        String alias = "07d1e09a-dac5-43c9-9a5f-ca30d208ccf0";
		
        InputStream readStream = new FileInputStream(filePathToStore);
        ks.load(readStream, keystorePasswordCharArray.toCharArray());
        
        ks.getKey(alias, passwordForKeyCharArray.toCharArray() );
        CreateSignature obj = new CreateSignature(ks, passwordForKeyCharArray.toCharArray());
		
        java.io.File inFile = new File("/home/rafael/your_unsigned_file.pdf");
        java.io.File inFile2 = new File("/home/rafael/your_signed_file");
```

### Creating keystore file from .cert pkcs12
keytool -importkeystore -srckeystore agro.pfx -srcstoretype pkcs12 -destkeystore agro.jks -deststoretype JKS


### List all alias inside pfx pkcs12 file
keytool -v -list -keystore agro.pfx -storetype pkcs12

## Runing / Installing on NetBeans
1. Open Project
2.  Select Project and Click "RUN" or select /src/br/com/rendti/forms/FormTeste.java file and click "RUN"
![Screenshot](Capture.JPG)




