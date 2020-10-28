package com.example.application.views.SurveyView;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;

@Route(value = "About", layout = MainView.class)
@PageTitle("Pesquisa")
@CssImport("./styles/views/about/about-view.css")
public class SurveyView extends Div {

    public SurveyView() {
        
        setId("about-view");   

        //Inclui um check-box
        Checkbox checkbox1 = new Checkbox();      
        checkbox1.setValue(true);
        add(checkbox1);

        //Inclui um campo
        FormLayout nameLayout1 = new FormLayout();
        TextField titleField1 = new TextField();
        titleField1.setWidth("700px");
        titleField1.setLabel("Digite a sua pergunta para cadastro");
        titleField1.setPlaceholder("e.g. (FGV/CODEBA) A figura mostra a planificação das faces de um cubo.");

        nameLayout1.add(titleField1);

        nameLayout1.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout1);


        //Inclui um check-box
        Checkbox checkbox2 = new Checkbox();
        checkbox2.setValue(true);
        checkbox2.setLabel("Marque se for a resposta correta");
        add(checkbox2);

        //Inclui um campo 
        FormLayout nameLayout2 = new FormLayout();
        TextField titleField2 = new TextField();
        titleField2.setWidth("700px");
        titleField2.setLabel("Digite a url da imagem");
        titleField2.setPlaceholder("e.g. https://static.todamateria.com.br/upload/cu/bo/cubologico.jpg");

        nameLayout2.add(titleField2);

        nameLayout2.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout2);

        Image image = new Image("https://static.todamateria.com.br/upload/cu/bo/cubologico.jpg", "Cubo");
        setId("image1");
        add(image); 

        //Inclui um check-box
        Checkbox checkbox3 = new Checkbox();    
        checkbox3.setValue(true);
        checkbox3.setLabel("Marque se for a resposta correta");
        add(checkbox3);

        //Inclui um campo 
        FormLayout nameLayout3 = new FormLayout();
        TextField titleField3 = new TextField();
        titleField3.setLabel("a)");
        titleField3.setWidth("700px");
        titleField3.setPlaceholder("e.g. A");

        nameLayout3.add(titleField3);

        nameLayout3.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout3);

        //Inclui um check-box
        Checkbox checkbox4 = new Checkbox();    
        checkbox4.setValue(true);
        checkbox4.setLabel("Marque se for a resposta correta");
        add(checkbox4);

        //Inclui um campo 
        FormLayout nameLayout4 = new FormLayout();
        TextField titleField4 = new TextField();
        titleField4.setWidth("700px");
        titleField4.setLabel("b)");
        titleField4.setPlaceholder("e.g. B");

        nameLayout4.add(titleField4);

        nameLayout4.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout4);

        //Inclui um check-box
        Checkbox checkbox5 = new Checkbox();    
        checkbox5.setValue(true);
        checkbox5.setLabel("Marque se for a resposta correta");
        add(checkbox5);
        
        //Inclui um campo
        FormLayout nameLayout5 = new FormLayout();
        TextField titleField5 = new TextField();
        titleField5.setWidth("700px");
        titleField5.setLabel("c)");
        titleField5.setPlaceholder("e.g. C");

        nameLayout5.add(titleField5);

        nameLayout5.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout5);

        //Inclui um check-box
        Checkbox checkbox6 = new Checkbox();    
        checkbox6.setValue(true);
        checkbox6.setLabel("Marque se for a resposta correta");
        add(checkbox6);

        //Inclui um campo 
        FormLayout nameLayout6 = new FormLayout();
        TextField titleField6 = new TextField();
        titleField6.setWidth("700px");
        titleField6.setLabel("d)");
        titleField6.setPlaceholder("e.g. D");

        nameLayout6.add(titleField6);

        nameLayout6.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout6);

        //Inclui um check-box
        Checkbox checkbox7 = new Checkbox();    
        checkbox7.setValue(true);
        checkbox7.setLabel("Marque se for a resposta correta");
        add(checkbox7);

        //Inclui um campo 
        FormLayout nameLayout7 = new FormLayout();
        TextField titleField7 = new TextField();
        titleField7.setWidth("700px");
        titleField7.setLabel("e)");
        titleField7.setPlaceholder("e.g. E");

        nameLayout7.add(titleField7);

        nameLayout7.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout7);

        //Inclui um campo 
        FormLayout nameLayout8 = new FormLayout();
        TextField titleField8 = new TextField();
        titleField8.setWidth("700px");
        titleField8.setLabel("Feedback");
        titleField8.setPlaceholder("e.g. Sua resposta está correta!");

        nameLayout8.add(titleField8);

        nameLayout8.setResponsiveSteps(
                new ResponsiveStep("80em", 1));
        add(nameLayout8);
        
    }

}
