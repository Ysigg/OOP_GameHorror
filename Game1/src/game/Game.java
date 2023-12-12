package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author naufa
 */

public class Game {
    
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);
    
    String position1, position2, position3, position4;
    
    public static void main(String[] args){
        // Membuat instance objek Game yang baru
        new Game();
    }
    
    // Konstruktor Game
    public Game(){
        
        ui.screenUI(cHandler);
        story.defaultSetUp();
        vm.showTitleScreen();
    }
    
    // method ChoiceHandler sebagai ActionListener
    public class ChoiceHandler implements ActionListener{
              
        @Override
        public void actionPerformed(ActionEvent event){
                      
            String Choices = event.getActionCommand();
            
            switch(Choices){
                case "start": vm.titleToGame(); story.Panduan(); break;
                case "c1": story.selectPosition(position1); break;
                case "c2": story.selectPosition(position2); break;
                case "c3": story.selectPosition(position3); break;
                case "c4": story.selectPosition(position4);break;
            }
        }
    }
}