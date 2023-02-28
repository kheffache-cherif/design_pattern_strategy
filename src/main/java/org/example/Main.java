package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // utilisation de la methode effectuerOperation mais selon des context different
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner= new Scanner(System.in);
        //OBJET MAP COMME CACHE MEMOIR
        Map<String,IStrategy> strategyMap = new HashMap<>();
        IStrategy iStrategy;

        while (true){
            System.out.println("Quelle Strategie voulez vous appliquer  ??");
            String str = scanner.nextLine();
            iStrategy= strategyMap.get(str);
            if(iStrategy==null){ // si c'est un objet non instancié // i trouvable dans cache memoire

                System.out.println("Creation d'un nouvel objet de StrategyImp"+str);
                // Creation d'une instance dynamic avec formName() et la caster
                iStrategy = (IStrategy) Class.forName("org.example.StrategyImp"+str).getConstructor().newInstance();
                strategyMap.put(str,iStrategy);
            }

            context.setiStrategy(iStrategy);
            context.effectuerOperation();
        }

      /*  context.setiStrategy(new StrategyImp1());
        context.effectuerOperation();

        context.setiStrategy(new StrategyImp2());
        context.effectuerOperation();

        context.setiStrategy(new StrategyImp3());
        context.effectuerOperation();*/

    }

}