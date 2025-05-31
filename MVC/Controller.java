// package MVCExample;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        this.view.getGreetButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                String name = view.getNameInput();
                model.setName(name);
                view.setGreeting(model.getGreeting());
            } 
        });
    }
}
     
      
    

