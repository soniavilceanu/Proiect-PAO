#Proiect-PAO

###Lista tipuri de obiecte:

##Din pachetul model:
    Angajat
    Departament
    Manager
    Job
    Proiect
    CategorieProiect
    Buget
    Cheltuieli

##Din pachetul Repository:
    AngajatRepository
    DepartamentRepository
    ManagerRepository
    JobRepository
    ProiectRepository
    CategorieProiectRepository
    BugetRepository
    CheltuieliRepository
    
 ##din pachetul Service:
    AngajatService
    DepartamentService
    ManagerService
    JobService
    ProiectService
    CategorieProiectService
    BugetService
    CheltuieliService
    
 ###Interogari care se pot face in cadrul sistemului:
 
    1.setare campurilor obiectelor: departamente, id-uri, salarii, manageri, comision
    2.cautare obiecte dupa id
    3.cautare obiecte dupa nume
    4.calcularea salariului mediu
    5.calcularea cheltuielii cu impozitul sustras
    6.atribuirea de proiecte unui manager
    7.asignarea angajatilor unui departament
    8.impartirea proiectelor in categorii
    9.contorizarea cheltuielilor
    10.administrarea angajatilor in departamente
    
    
    Etapa II
    -adaugat service-uri de citire/scriere in fisier csv pentru fiecare clasa din pachetul Model
    -adaugat Log service pentru monitorizarea actiunilor din service + ora modificarii
