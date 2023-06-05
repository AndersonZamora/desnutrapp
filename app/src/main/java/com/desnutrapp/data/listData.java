package com.desnutrapp.data;

import androidx.annotation.NonNull;

import com.desnutrapp.models.canDoModel;
import com.desnutrapp.models.coordinationAreaModel;
import com.desnutrapp.models.howStimulateModel;
import com.desnutrapp.models.languageAreaModel;
import com.desnutrapp.models.motorAreaModel;
import com.desnutrapp.models.socialAreaModel;
import com.desnutrapp.models.stimulationModel;

import java.util.ArrayList;
import java.util.List;

public class listData {

    public listData() {
        // Build required
    }

    @NonNull
    public stimulationModel data03() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Aprieta el dedo de la mama al colocarlo en su mano.");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("Al mes, al colocarlo boca abajo es capaz de mover la cabeza.");
        canDoModels.add(canDoModel2);

        canDoModel canDoModel3 = new canDoModel();
        canDoModel3.setTitle("Al segundo mes, trata de enderezar la cabeza al sentarlo.");
        canDoModels.add(canDoModel3);

        canDoModel canDoModel4 = new canDoModel();
        canDoModel4.setTitle("Al tercer mes, mantiene la cabeza levantada al sentarlo.");
        canDoModels.add(canDoModel4);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Ponerle un dedo en cada manito para que los apriete y luego tirar suavemente, de modo que el nine haga fuerza.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Tomarle las piernas, estirarlas y doblarlas, No ponerle ropa que le impida moverse.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Al bañarlo o vestirlo, dejarlo moverse libremente durante unos minutos.");
        howStimulateModels.add(howStimulateModel3);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Sigue con la vista un objeto que se le mueve delante.");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("Al tercer mes. busca con la vista al escuchar un sonido (voz de la mara, cascabel, etc), comienza a tomar cosas y a echarselas a la boca.");
        canDoModelsCoordination.add(canDoModelCo2);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Tocar los dedos uno a uno y abrirlas suavemente.");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Hacer que siga objetos con la vista: mientras está en la cuna, mostrarle cosas de colores vivos y moverlas lentamente de un lado a otro, Se puede colar un móvil de colores alegres, ponerlo cerca de una ventana, etc, si el tiempo es bueno. se le puede sacar al patio o jardín, para que vea cosas diferentes.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Pasarle objetos lavables y que se pueda llevar a la boca sin riesgo de que se ahogue.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Al mes fija la vista en la persona que le habla.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Al segundo mes hace sonidos al hablarle.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("Al tercer mes sonríe al hablarle.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Acostumbrarlo a estar con distintas personas y lugares; aprovechar los momentos entre las comidas, cuando está despierto.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Llamarlo por su nombre.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Demostrarle cariño, hablarle suavemente acariciarlo, tomarlo en brazos.");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        howStimulateModel howStimulateModelSocial4 = new howStimulateModel();
        howStimulateModelSocial4.setTitle("Colocarle musica suave.");
        howStimulateModelsSocial.add(howStimulateModelSocial4);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Al mes, reacciona al ruido cerca de su oído.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Al segundo mes dice «a», «u» dos sonidos diferentes.");
        canDoModelsLanguage.add(canDoModelLanguage2);

        canDoModel canDoModelLanguage3 = new canDoModel();
        canDoModelLanguage3.setTitle("Al tercer mes hace sonidos más prolongados,  «aa», «uu».");
        canDoModelsLanguage.add(canDoModelLanguage3);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Repetir los sonidos que hace el niño, sonreirle, conversarle en forma constante y suave, por ejemplo, cantarle mientras lo cambia de ropa.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Hacerle cariño mientras le habla.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño de 0 a 3 meses");
        stimulationModel.setDescription("Qué debe ser capaz de hacer un niño entre 0 y 3 meses de edad y como podemos estimularlo");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data46() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Si lo tomamos de las manos para llevarlo a posición sentado, él ayuda a sentarse.");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("A los seis meses se mantiene sentado sin apoyo, aunque solo por un rato.");
        canDoModels.add(canDoModel2);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Poner al niño boca abajo para que levante cabeza y pecho: mostrarle algo vistoso para que trate de tomarlo.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Ponerlo acostado de espalda: hacer que tome los dedos y trate de sentarse.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Pararlo para que haga intentos de caminar.");
        howStimulateModels.add(howStimulateModel3);

        howStimulateModel howStimulateModel4 = new howStimulateModel();
        howStimulateModel4.setTitle("Colocarlo boca abajo para que gatee: al comienzo ayúdalo.");
        howStimulateModels.add(howStimulateModel4);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Al oír un sonido gira la cabeza, buscándolo ( coordinación y lenguaje ).");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("Palpa el borde de la mesa cuando está sentado en la falda de la mama.");
        canDoModelsCoordination.add(canDoModelCo2);

        canDoModel canDoModelCo3 = new canDoModel();
        canDoModelCo3.setTitle("Al acercarle una argolla el niño la coge.");
        canDoModelsCoordination.add(canDoModelCo3);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Pasarle algo que le llame la atención (siempre que no sea peligroso), para que lo tome.");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Jugar a Las escondidas con el niño, tapándole la cara con un pañal.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Pasarle una cucharilla para que aprenda a tomarla, por ejemplo, mientras usted lo alimenta.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Ríe a carcajadas ( social y lenguaje ).");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Vuelve la cabeza hacia quien le habla.");
        canDoModelsSocial.add(canDoModelArea2);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Hablarle, sonreírle, permitirle mirar el máximo de cosas, nombrar y mostrarle personas.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Premiarlo con besos y sonrisas.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Acostumbrar a los ruidos normales de la casa, es decir. no obligar a la familia a guardar silencio.");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Trata de repetir las palabras que le dicen ( social-lenguaje ).");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Emite sonidos más prolongados (u,u,u).");
        canDoModelsLanguage.add(canDoModelLanguage2);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Mientras le da de comer, nombrar las personas y las cosas que tiene cerca.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Repetirle los sonidos que el niño hace, mientras lo muda, lo baña etc.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Cantarle al niño cualquier canción de cuna.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El Niño de 4 a 6 meses");
        stimulationModel.setDescription("Qué debe ser capaz de hacer el niño entre los 4 y 6 meses y como estimularlo 7");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data711() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Alos 7 meses se sienta sin cojines.");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("Alos 8 meses se sienta solo.");
        canDoModels.add(canDoModel2);

        canDoModel canDoModel3 = new canDoModel();
        canDoModel3.setTitle("Alos 9 meses se pone de pie y antes del año ya camina con ayuda.");
        canDoModels.add(canDoModel3);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Ayudarlo a pararse, apoyado en sillas, cama, etc.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Ayudarlo a caminar, tomándolo de la mano, sacarlo a pasear.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Tenerlo en un corral, por su seguridad y porque así ejercita más sus piernas y brazos.");
        howStimulateModels.add(howStimulateModel3);

        howStimulateModel howStimulateModel4 = new howStimulateModel();
        howStimulateModel4.setTitle("Esconderle objetos y pedirle que los busque (gateando, destapando, etc.).");
        howStimulateModels.add(howStimulateModel4);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Es capaz de coger objetos con las dos manos.");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("Encuentra un objeto escondido bajo un paño.");
        canDoModelsCoordination.add(canDoModelCo2);

        canDoModel canDoModelCo3 = new canDoModel();
        canDoModelCo3.setTitle("Coge un botón de encima de la mesa.");
        canDoModelsCoordination.add(canDoModelCo3);

        canDoModel canDoModelCo4 = new canDoModel();
        canDoModelCo4.setTitle("Aplaude con las manos y tira y coje objetos.");
        canDoModelsCoordination.add(canDoModelCo4);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Enseñarle a aplaudir, a hacer «ojitos» «chinitos».");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Pasarle un vaso con poca agua para que trate de beberla solo.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Enseñarle a pasar objetos por una ranura [caja de zapatos u otra ala que se le hacen diferentes agujeros].  Los objetos deben ser lavables y no muy chicos porque se los llevan a la boca.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Imita gestos tales como hacer «chao» con las manos.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Entrega lo que tiene en la mano al pedírselo.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("Reconoce cuando lo llaman por su nombre.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Pedirle algo que tenga el niño en las manos y darle las gracias cuando lo ha entregado.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Poner al niño cerca de la mama cuando ella haga las cosas de la casa para que la observe.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Llamarlo por su nombre. para que se identifique y aprenda a responder cuándo lo amen.");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        howStimulateModel howStimulateModelSocial4 = new howStimulateModel();
        howStimulateModelSocial4.setTitle("Hacerle un muñeco de tela; si es posible usar colores vistosos y alegres.");
        howStimulateModelsSocial.add(howStimulateModelSocial4);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Dice «da-da» o algo parecido.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Reacciona al decirle «no-no»");
        canDoModelsLanguage.add(canDoModelLanguage2);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Repetir los sonidos que el niño hace.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Mientras lo viste, nombrarle partes de su cuerpo, tocándoselas.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Pedirle objetos que el niño tenga en sus manos.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        howStimulateModel howStimulateModelLanguage4 = new howStimulateModel();
        howStimulateModelLanguage4.setTitle("Hablarle mientras hace las tareas del hogar, por ejemplo, mientras plancha mostrarle y nombrar la ropa (camisa del papa, vestido de la mamá, etc.).");
        howStimulateModelsLanguage.add(howStimulateModelLanguage4);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño entre 7 y 11 meses");
        stimulationModel.setDescription("Qué debe ser capaz de hacer el niño entre los 7 y 11 meses y como estimularlo");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data1214() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("12 meses: Camina de la mane y apoyado de muebles (cama. sillones, etc.).");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("18 meses: Camina solo, da pasos hacia atrás, corre con escasa estabilidad.");
        canDoModels.add(canDoModel2);

        canDoModel canDoModel3 = new canDoModel();
        canDoModel3.setTitle("24 meses: se para en un pie, con ayuda. Puede subir y bajar de escaleras, de sillas. cama, salta con ayuda. Corre y trepa.");
        canDoModels.add(canDoModel3);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Sacarlo a caminar todos los días.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Esconderle cosas para que las busque.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Comprarle una pelota chica de plástico o goma, o bien hacerle una de tela y jugar con él.");
        howStimulateModels.add(howStimulateModel3);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("12 meses: toma cosas con los dedos índice y pulgar. Busca cosas que desaparecen.");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("18 meses: ayuda a vestirse. Al pasarle un lápiz, raya espontáneamente. Toma 3 objetos a la vez. Hace Lorre con 3 cubos.");
        canDoModelsCoordination.add(canDoModelCo2);

        canDoModel canDoModelCo3 = new canDoModel();
        canDoModelCo3.setTitle("24 meses: saca e introduce cosas de fraseos o botellas. hojea libros y revistas. Construye torre con 5 cubos.");
        canDoModelsCoordination.add(canDoModelCo3);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Pasarle revistas para hojear.");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Colocarle migas de pan en la mesa y enseñarle al niño a cogerlas y echarlas a una taza, con los dedos. Darle agua en vaso.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Pedirle al niño que ayude a desgranar o amasar.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("12 meses: disfruta de la compañía de los mayores.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("18 meses: colabora en tareas simples. Al preguntarle por sus zapatos, levanta un pie o los señala.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("24 meses: comienza a compartir juegos con otros niños. Dice chau y hola. Comienza a avisar pipi. Le gusta jugar a barrer, limpiar, lavar. Como solo.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Dejarlo que coma solo. Enseñarle a avisar pipi.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Enseñarle a despedirse, tirar besitos y hacer chao. Tratar de que juegue con otros niños.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Celebrarle sus intentos de imitar a los adultos peinándose, llevando paquetes, etc.");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("12 meses: dice a lo menos 3 palabras. Reacciona cuando se le dice no.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("18 meses: Dice 6 palabras y las usa para expresar lo que desea (pan, papa ). Comprende ordenes simples. Puede nombrar dos personas, aparte del papa y la mama.");
        canDoModelsLanguage.add(canDoModelLanguage2);

        canDoModel canDoModelLanguage3 = new canDoModel();
        canDoModelLanguage3.setTitle("24 meses: indica con el dedo parte de su cuerpo o el de una muñeca cuando se las nombran. Construye frases de 2 o 3 palabras.");
        canDoModelsLanguage.add(canDoModelLanguage3);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Mientras lo viste, nombrarle las ropas que se le van colocando. Hacer lo mismo al planchar y lavar la ropa.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Enseñarle canciones, contarle pequeños cuentos, etc.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Cuando el niño quiera algo, tratar de que lo pida por su nombre y no con gestos y sonidos.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño entre 12 y 14 meses");
        stimulationModel.setDescription("Qué debe ser capaz de hacer el niño entre los 7 y 11 meses y como estimularlo");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data23() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Camina bien, sube y baja escaleras, come con más seguridad se puede parar en un pie sin apoyo durante un segundo.");
        canDoModels.add(canDoModel1);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Permitirle hacer ejercicios, vigilando que no ocurra accidentes.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Enseñarle a desarrollar actividades a través del juego o participar en tareas del hogar saltar como conejito dar en la punta de los pies. subir y bajar de muebles, escaleras, cerros, jugar al pillarse, pararse en un pie. etc.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Sacarlo de paseo, hacerlo caminar, correr, saltar, jugar al columpio, a los caballitos.");
        howStimulateModels.add(howStimulateModel3);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Pinta trazos en papel, hace líneas y figuras circulares. Bebe de un vaso sin derramar, desata cordones, puede vestirse solo, se puede lavar solo.");
        canDoModelsCoordination.add(canDoModelCo1);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Pasarle lápiz y papel para que trace líneas; enseñarle a hacer círculos. Pasarle un vaso de plástico con poco líquido para que se lo tome.");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Enseñarle a cepillarse los dientes. A lavarse solo, las manos y cara: al comienzo lo hace como imitación, luego lo transforma en habito.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Permitirle colaborar: sacudir acarrear objetos livianos y que no presenten peligro para el niño. Dejarlo que coma solo; al comienzo cuesta porque se ensucia, demora más, etc. Pero es conveniente que el niño aprenda tempranamente a comer solo.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Le gusta jugar con otros niños. Es independiente, quiere comer solo, avisa si quiere pipi durante el día.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Le gusta llamar la atención. Reconoce su sexo. Esta en la etapa no y le pueden dar pataletas.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("Quiere sentirse aceptado.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Permitirle jugar con otros niños (inscribirlo si hay jardín infantil).");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Enseñarle a ir solo al baño. Hacerlo con paciencia y con cariño. ya que, si se le apura, disminuye su confianza en sí mismo y puede retro- ceder en lo aprendido. Cada niño tiene su horario para ir al baño, se le debe respetar.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Si no está acostumbrado a sentarse en la bacinica, debe comenzar a hacerlo por raritos cortes y sin exigirle que haga pipi, de este modo le pierde el miedo y se va acostumbrando a estar por más rato sentado hasta que al fin le pierde el temor.");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Es más fluido y correcto, entiende ordenes sencillas.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Hace frases y comienza a reconocer conceptos (grande, chico).");
        canDoModelsLanguage.add(canDoModelLanguage2);

        canDoModel canDoModelLanguage3 = new canDoModel();
        canDoModelLanguage3.setTitle("24 meses: indica con el dedo parte de su cuerpo o el de una muñeca cuando se las nombran. Construye frases de 2 o 3 palabras. Conoce su cuerpo y sus sentidos.");
        canDoModelsLanguage.add(canDoModelLanguage3);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Hablarle correctamente y corregirlo cuando no pronuncie bien.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Comenzar a enseñarle conceptos (el papa es grande, el niño es chico). Enseñarle canciones, poesías cortas enseñarle su nombre completo y su edad, por ejemplo, jugando a las escondidas, poniéndole frente a un espejo y nombrarlo (¿dónde está? ..Ahí está).");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Enseñarle a conocer y a nombrarle partes de su cuerpo.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño entre 2 a 3 años");
        stimulationModel.setDescription("A esta edad, el niño desarrolla no solo su independencia, sino también la confianza en sí mismo");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data34() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Usa bien ambas manos para manejar cuchara y taza.");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("Puede llevar y traer objetos con seguridad.");
        canDoModels.add(canDoModel2);

        canDoModel canDoModel3 = new canDoModel();
        canDoModel3.setTitle("Salta en un solo pie. Abre y cierra puertas.");
        canDoModels.add(canDoModel3);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Dejarlo comer solo, darle la leche en taza.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Enseñarle a saltar en un pie, a imitar saltos de conejo, rana, etc. hacer mímicas o ejercicios físicos mientras escucha un relato (salta, agita una mano, aplaude. busca algo, etc.).");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Permitirle hacer ejercicios o jugar con otros niños (a la ronda. en columpio, balancines, a la pelota, etc.).");
        howStimulateModels.add(howStimulateModel3);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Puede vaciar líquido  de un objeto a otro.");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("Hace dibujos con formas más definidas (circulo, cruz).");
        canDoModelsCoordination.add(canDoModelCo2);

        canDoModel canDoModelCo3 = new canDoModel();
        canDoModelCo3.setTitle("Corta papel con tijera (aunque no perfecto). Se lava solo la cara, las manos y los dientes.");
        canDoModelsCoordination.add(canDoModelCo3);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Enseñarle a hacer dibujos con formas más definidas (circulo, cruz, cuadrado). Enseñarle a armar rompecabezas");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Hacerle cubos para que arme torres.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Pasarle tijera de punta redonda para que corte papeles.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Se viste y desviste solo. Le gusta jugar con otros niños.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Sabe su nombre completo y su edad. Indica lo que quiere.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("Hace demostraciones de enojo.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Permitirle vestirse y escoger su ropa.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Enseñarle su nombre completo, su edad y como se llama el lugar donde vive.");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        howStimulateModel howStimulateModelSocial3 = new howStimulateModel();
        howStimulateModelSocial3.setTitle("Enseñarle a guardar sus juguetes (forrarle una caja grande con papel de colores).");
        howStimulateModelsSocial.add(howStimulateModelSocial3);

        howStimulateModel howStimulateModelSocial4 = new howStimulateModel();
        howStimulateModelSocial4.setTitle("Darle oportunidades de compartir con otros niños (fiestas familiares, eventos comunitarios, jardín infantil, paseos, cte.).");
        howStimulateModelsSocial.add(howStimulateModelSocial4);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Reconoce y nombra colores. Repite números y hace frases cortas.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Hace preguntas (¿por qué?). Cuenta historias mezcladas con fantasías.");
        canDoModelsLanguage.add(canDoModelLanguage2);

        canDoModel canDoModelLanguage3 = new canDoModel();
        canDoModelLanguage3.setTitle("Nombra al menos 6 partes de su cuerpo.");
        canDoModelsLanguage.add(canDoModelLanguage3);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Enseñarle los colores en revistas, frutas, ropa y elementos del hogar y de su comunidad (semáforos, colores de las casas, etc.).");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Enseñarle a contar (con objetos. dedos, etc.). decir poesías, rimas, etc.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Contarle cuentos y estimularlo a que él los vaya repitiendo.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        howStimulateModel howStimulateModelLanguage4 = new howStimulateModel();
        howStimulateModelLanguage4.setTitle("Corregirle las palabras que usa incorrectamente, repeliéndoselas en forma correcta; evitar decirle «esto está mal dicho», decir «así se dice»");
        howStimulateModelsLanguage.add(howStimulateModelLanguage4);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño entre 3 a 4 años");
        stimulationModel.setDescription("Analicemos lo que puede hacer un niño a esta edad");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }

    @NonNull
    public stimulationModel data45() {

        /* Area Motor */

        List<canDoModel> canDoModels = new ArrayList<>();

        canDoModel canDoModel1 = new canDoModel();
        canDoModel1.setTitle("Es muy activo, le comienza a interesar los deportes, atrapa y lanza pelotas.");
        canDoModels.add(canDoModel1);

        canDoModel canDoModel2 = new canDoModel();
        canDoModel2.setTitle("Le gusta saltar, correr, etc.");
        canDoModels.add(canDoModel2);

        List<howStimulateModel> howStimulateModels = new ArrayList<>();

        howStimulateModel howStimulateModel1 = new howStimulateModel();
        howStimulateModel1.setTitle("Se interesa por algún deporte, tratar de darle las facilidades para que lo practique, o juegue con la familia.");
        howStimulateModels.add(howStimulateModel1);

        howStimulateModel howStimulateModel2 = new howStimulateModel();
        howStimulateModel2.setTitle("Celebrar sus aciertos y ayudarle si se le dificulta. Dibujar una línea recta en el suelo y caminar sobre ella.");
        howStimulateModels.add(howStimulateModel2);

        howStimulateModel howStimulateModel3 = new howStimulateModel();
        howStimulateModel3.setTitle("Dejarlo participar en juegos grupales, como la ronda, las escondidas, carreras, etc.");
        howStimulateModels.add(howStimulateModel3);

        motorAreaModel motorAreaModelD = new motorAreaModel();
        motorAreaModelD.setCanDoModels(canDoModels);
        motorAreaModelD.setHowStimulateModels(howStimulateModels);

        /* Area Motor FIN*/

        /* Area Coordination */

        List<canDoModel> canDoModelsCoordination = new ArrayList<>();

        canDoModel canDoModelCo1 = new canDoModel();
        canDoModelCo1.setTitle("Hace dibujos sencillos (circulo, cuadrado).");
        canDoModelsCoordination.add(canDoModelCo1);

        canDoModel canDoModelCo2 = new canDoModel();
        canDoModelCo2.setTitle("Colabora en tareas simples del hogar y lo hace con seguridad.");
        canDoModelsCoordination.add(canDoModelCo2);

        canDoModel canDoModelCo3 = new canDoModel();
        canDoModelCo3.setTitle("Puede cepillar solo sus dientes.");
        canDoModelsCoordination.add(canDoModelCo3);

        canDoModel canDoModelCo4 = new canDoModel();
        canDoModelCo4.setTitle("Se pone los zapatos. usa bien cierre y botones.");
        canDoModelsCoordination.add(canDoModelCo4);

        List<howStimulateModel> howStimulateModelsCoordination = new ArrayList<>();

        howStimulateModel howStimulateModelCo1 = new howStimulateModel();
        howStimulateModelCo1.setTitle("Enseñarle dibujos sencillos. Como ya puede hacer círculos, Enseñarle a hacer flores, racimos de uva, trencitos (de pelotas o cuadrados).");
        howStimulateModelsCoordination.add(howStimulateModelCo1);

        howStimulateModel howStimulateModelCo2 = new howStimulateModel();
        howStimulateModelCo2.setTitle("Hacerle o darle rompecabezas para que lo arme.");
        howStimulateModelsCoordination.add(howStimulateModelCo2);

        howStimulateModel howStimulateModelCo3 = new howStimulateModel();
        howStimulateModelCo3.setTitle("Darle tareas sencillas para que realice: sacudir, recoger sus juguetes, ordenar su cuarto.");
        howStimulateModelsCoordination.add(howStimulateModelCo3);

        coordinationAreaModel coordinationAreaModelD = new coordinationAreaModel();
        coordinationAreaModelD.setCanDoModels(canDoModelsCoordination);
        coordinationAreaModelD.setHowStimulateModels(howStimulateModelsCoordination);

        /* Area Coordination Fin */

        /* Area Social */

        List<canDoModel> canDoModelsSocial = new ArrayList<>();

        canDoModel canDoModelArea1 = new canDoModel();
        canDoModelArea1.setTitle("Comparte más sus juegos y juguetes con otros niños.");
        canDoModelsSocial.add(canDoModelArea1);

        canDoModel canDoModelArea2 = new canDoModel();
        canDoModelArea2.setTitle("Demuestra interés por aprender. Le gusta oír cuentos.");
        canDoModelsSocial.add(canDoModelArea2);

        canDoModel canDoModelArea3 = new canDoModel();
        canDoModelArea3.setTitle("Trata de imitar a personajes (cantantes), le gusta que lo admiren y ratifiquen.");
        canDoModelsSocial.add(canDoModelArea3);

        List<howStimulateModel> howStimulateModelsSocial = new ArrayList<>();

        howStimulateModel howStimulateModelSocial1 = new howStimulateModel();
        howStimulateModelSocial1.setTitle("Relatarle historias, enseñarle canciones y mímicas, poesías más largas, adivinanzas y celebrarle sus aciertos y las imitaciones.");
        howStimulateModelsSocial.add(howStimulateModelSocial1);

        howStimulateModel howStimulateModelSocial2 = new howStimulateModel();
        howStimulateModelSocial2.setTitle("Permitirle jugar con otros niños y participar en actividades con los adultos (reuniones familiares, eventos que se desarrollen en su comunidad, etc.).");
        howStimulateModelsSocial.add(howStimulateModelSocial2);

        socialAreaModel socialAreaModelD = new socialAreaModel();
        socialAreaModelD.setCanDoModels(canDoModelsSocial);
        socialAreaModelD.setHowStimulateModels(howStimulateModelsSocial);

        /* Area Social Fin */

        /* Area Lenguaje */

        List<canDoModel> canDoModelsLanguage = new ArrayList<>();

        canDoModel canDoModelLanguage1 = new canDoModel();
        canDoModelLanguage1.setTitle("Pregunta mucho: porqué, como, cuando.");
        canDoModelsLanguage.add(canDoModelLanguage1);

        canDoModel canDoModelLanguage2 = new canDoModel();
        canDoModelLanguage2.setTitle("Se ubica en el espacio (arriba, abajo, adentro).");
        canDoModelsLanguage.add(canDoModelLanguage2);

        canDoModel canDoModelLanguage3 = new canDoModel();
        canDoModelLanguage3.setTitle("Diferencia: grande de pequeño, mucho o poco, izquierda de derecha, etc.");
        canDoModelsLanguage.add(canDoModelLanguage3);

        List<howStimulateModel> howStimulateModelsLanguage = new ArrayList<>();

        howStimulateModel howStimulateModelLanguage1 = new howStimulateModel();
        howStimulateModelLanguage1.setTitle("Conversarle, evitando monosílabos (si-no), tratar de no dejar sin respuestas sus dudas y corregirle si pronuncia mal.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage1);

        howStimulateModel howStimulateModelLanguage2 = new howStimulateModel();
        howStimulateModelLanguage2.setTitle("Enseñarle diferentes palabras con significados similares (bonito, hermosa, bello, maravillosa).");
        howStimulateModelsLanguage.add(howStimulateModelLanguage2);

        howStimulateModel howStimulateModelLanguage3 = new howStimulateModel();
        howStimulateModelLanguage3.setTitle("Enseñarle palabras con diferentes significados: hermoso-feo; frio-caliente: grande, pequeño, primero, último, liviano, pesado, áspero, liso, etc.");
        howStimulateModelsLanguage.add(howStimulateModelLanguage3);

        howStimulateModel howStimulateModelLanguage4 = new howStimulateModel();
        howStimulateModelLanguage4.setTitle("Corregirle las palabras que usa incorrectamente, repeliéndoselas en forma correcta; evitar decirle «esto está mal dicho», decir «así se dice»");
        howStimulateModelsLanguage.add(howStimulateModelLanguage4);

        languageAreaModel languageAreaModelD = new languageAreaModel();
        languageAreaModelD.setCanDoModels(canDoModelsLanguage);
        languageAreaModelD.setHowStimulateModels(howStimulateModelsLanguage);

        stimulationModel stimulationModel = new stimulationModel();
        stimulationModel.setTitle("El niño entre 4 a 5 años");
        stimulationModel.setDescription("Analicemos lo que puede hacer un niño a esta edad");
        stimulationModel.setMotorAreaModelD(motorAreaModelD);
        stimulationModel.setCoordinationAreaModelD(coordinationAreaModelD);
        stimulationModel.setSocialAreaModelD(socialAreaModelD);
        stimulationModel.setLanguageAreaModelD(languageAreaModelD);

        return stimulationModel;
    }
}
