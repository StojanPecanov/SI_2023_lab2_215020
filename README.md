Stojan Pecanov 215020

CFG
![CFG](https://github.com/StojanPecanov/SI_2023_lab2_215020/assets/129542051/a45ef2f9-5826-45d7-ae17-a13ad74701b4)

Цикломатската вредност е 11
Ги броев регионите за да стигнам до вредноста.

Every Branch критериум

![image](https://github.com/StojanPecanov/SI_2023_lab2_215020/assets/129542051/ff987bda-5500-4ba4-a8a0-4d350b7bfb96)

Тест 1: input User=null

Кога немаме корисници (users)

Тест 2: input username=null; pass=1234567!;email=user@gmail.com//new 

Кога немаме username, па usernamе=email и имаме нов email 

Тест 3: input username=1234567! Pass=1234567! Email=user@gmail.com //existing 

Кога имаме вредности за сите, но имаме постечки Email и username=Pass

Тест 4: input username=1234567!//existing Pass=12345679 Email=user@gmail.com //existing email

Кога Pass нема специјален карактер

Тест 5: input username=1234567!//existing Pass=123456 79 Email=usergmail.com /wrong email and pass

Кога во Pass имаме празно место и во Email немаме @

Multiple condition if (user==null || user.getPassword()==null || user.getEmail()==null)

![image](https://github.com/StojanPecanov/SI_2023_lab2_215020/assets/129542051/66057450-ca29-4df5-9731-da5c6a55f416)

![image](https://github.com/StojanPecanov/SI_2023_lab2_215020/assets/129542051/b95f1924-1f9d-4cf4-b29c-d14ac90b65bf)


