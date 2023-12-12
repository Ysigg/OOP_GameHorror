package game;

/**
 *
 * @author naufa
 */
public class VisibilityManager{
   
    UI ui;
    
    public VisibilityManager(UI userInterface){
        
        ui = userInterface;

    }
    
    //method untuk menampilkan tampilan judul
    public void showTitleScreen(){
        
        // Tampilkan Title Screen
        ui.titleNameLabel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        
        // Hilangkan tampilan Game Screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }
    
    //method untuk menampilkan tampilan game
    public void titleToGame(){
        
        // hilangkan Title Screen
        ui.titleNameLabel.setVisible(false);
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        
        // Tampilkan Game Screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
