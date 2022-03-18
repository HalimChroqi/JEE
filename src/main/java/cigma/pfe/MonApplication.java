package cigma.pfe;

//import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.Client;;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.models.ClientNormal;
import cigma.pfe.models.ClientVip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

    public static void main(String[] args) {
        // ClientController ctrl1;
        // Client client =new Client(1L,"testing");
        // Client.save(client);

        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController)
        // context.getBean("controller"); // controller est l'id dans le fichierSpring.xml


       // ApplicationContext context = new
             //   ClassPathXmlApplicationContext("spring.xml");
      //  ClientController ctrl = (ClientController)
              //  context.getBean("controller"); // controller est l'id dans le fichierSpring.xml
       // Client client = new Client(1,"karim");
        //ctrl.save(client);




        //ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController) context.getBean("controller");
//        CFactureCR fctrl = (CFactureCR) context.getBean("fcontroller");

        // Test save use case for three clients
/*
        
        ctrl.save(new Client("Samir"));
        ctrl.save(new Client("Hassan"));
        ctrl.save(new Client("Samid"));
        ctrl.save(new Client("Kamal"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(1,"new Name"));
        // Test remove use case for client with id==1
       // ctrl.removeById(1L);
        // Test find use case for client with id==1
        Client found = ctrl.getById(1L);
*/

        //FACTURES


      //  FactureController ftrl = (FactureController) context.getBean("fcontroller");
       // ftrl.create(new Facture(new Date("01/01/2022"),10));
        //ftrl.delete(1);
       // ftrl.update(new Facture(new Date("15/12/2022"),20));
/*

        Client client = new Client("karim");
        List<Facture> factures = Arrays.asList(new Facture(1500,"facture1"),new Facture(2000,"facture2"));
        client.setPromotions(promotions);

        List<Promotion> promotions= Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setPromotions(carteFidelio);

        ctr.save(client);

 */
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctr= (ClientController) context.getBean("ctr1");
        // nouveau client
        ctr.save(new Client("Samir"));
        ctr.save(new Client("Hassan"));
        //Nouveau client VIP
        ctr.save(new ClientVip("Samid-VIP","preferences_01"));
        ctr.save(new ClientVip("Amir-VIP ","preferences_02"));
        //Nouveau Client Normal
        ctr.save(new ClientNormal("Mourad-Normal",1));
        ctr.save(new ClientNormal("Achraf-Normal",2));




    }
}
