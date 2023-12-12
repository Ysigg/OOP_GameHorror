package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author naufa
 */
public class Story {
    
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    
    public Story(Game g, UI userInterface, VisibilityManager vManager){
        
        game = g;
        ui = userInterface;
        vm = vManager;
    }
    
    public void defaultSetUp(){
        
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        
    }
    
    
    ////method untuk menampilkan tampilan game
    public void selectPosition(String position){
        
        switch(position){
            case "LatarBelakang": latarBelakang(); break;
            case "pulang" : pulang(); break;
            case "diDepanRumah": diDepanRumah() ; break;
            case "masukRumah" : masukRumah(); break;
            case "penasaran" : penasaran(); break;
            case "tetapPergi" : tetapPergi(); break;
            case "lose" : lose(); break;
            case "win" : win(); break;
            case "telusuri" : telusuri(); break;
            case "lorong" : lorong(); break;
            case "lorong1" : lorong1(); break;
            case "tutupMata" : tutupMata(); break;
            case "lantai2" : lantai2(); break;
            case "lantaivol2" : lantaivol2(); break;
            case "lihatSekitar" : lihatSekitar(); break;
            case "ambil" : ambil();break;
            case "abaikan" : abaikan();break;
            case "ruangkunci" : ruangkunci();break;
            case "raba" : raba();break;
            case "rabaBad" : rabaBad();break;
            case "nyala" : nyala();break;
            case "buku" : buku();break;
            case "bukuBuka" : bukuBuka();break;
            case "taruh" : taruh();break;
            case "keluar" : keluar();break;
            case "bawa" : bawa();break;
            case "lantai1" : lantai1();break;
            case "pintu" : pintu();break;
            case "salto" : salto(); break;
            case "lari" : lari(); break;
            case "lorongA1" : lorongA1(); break;
            case "lorongA2" : lorongA2(); break;
            case "lorongA3" : lorongA3(); break;
            case "kembaliA2" : kembaliA2(); break;
            case "kembaliLorong" : kembaliLorong(); break;
            case "periksaBelakang" : periksaBelakang(); break; 
            case "periksaA1" : periksaA1();  break;
            case "periksaA2" : periksaA2();  break;
            case "periksaA3" : periksaA3();  break;
            case "majuSerang" : majuSerang(); break;
            case "lariKembali" : lariKembali(); break;
            case "Ending" : Ending(); break;
            case "pintuLorong" : pintuLorong(); break;
            case "kembaliA3" : kembaliA3(); break;
            case "ambilDokumen" : ambilDokumen(); break;
        }
    }
    
    public void Panduan(){

       // position = "perjalanan";
        ui.mainTextArea.setText("Panduan Permainan:"
                + "\n\nGame ini menampilkan karakter dengan teknik POV"
                + "\n(Point of View)"
                + "\n\nReminder, jangan sampai point kerasukan mencapai batas 3."
                + "\nJika point kerasukanmu mencapai 3, maka kamu akan gagal"
                + "\n\nPecahkan semua misteri yang ada di rumah tersebut!!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "LatarBelakang";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";

    }

    public void latarBelakang(){
        
       // position = "perjalanan";
        ui.mainTextArea.setText("Malam itu, jalanan yang sepi dan gelap membuat perjalanan pulang terasa agak menyeramkan. "
                + "Di tengah keheningan itu, kamu melihat sebuah rumah yang \nbegitu besar dan megah, tetapi tampak terlantar dan ditinggalkan. "
                + "Pepohonan \nyang rimbun di sekitarnya menambah kesan misterius dari rumah itu."
                + "\n\nLangkahmu terhenti sejenak, dan rasa ingin tahu mulai membangkitkan pertanyaan dalam pikiranmu tentang sejarah rumah tersebut. "
                + "Namun, kesendirian dan ketakutan mulai merayapi pikiranmu.\n\nApa yang ingin kamu lakukan?");
        ui.choice1.setText("Lanjutkan Perjalanan");
        ui.choice2.setText("Mendekati Rumah");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "pulang";
        game.position2 = "diDepanRumah";
        game.position3 = "";
        game.position4 = "";
        
    }
    
    
    public void diDepanRumah(){
        
        //position = "diDepanRumah";
        ui.mainTextArea.setText("Kamu sekarang berdiri di depan sebuah rumah kosong.\n\nApa yang ingin kamu lakukan?");
    
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Masuk");
        ui.choice2.setText("Pulang");
        ui.choice3.setText("Penasaran?");
        ui.choice4.setText("");
        
        game.position1 = "masukRumah";
        game.position2 = "pulang";
        game.position3 = "penasaran";
        game.position4 = "";
    }
    
    public void masukRumah(){
        
        //position = "masukRumah";
        ui.mainTextArea.setText("Kamu memutuskan untuk masuk ke dalam rumah yang gelap dan sunyi.\n\nDi dalam, suasana terasa mencekam. \nKamu melihat benda-benda yang tertutup debu \ndan suasana yang aneh.\n\nApa yang ingin kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Telusuri Lebih Lanjut");
        ui.choice2.setText("Kembali Keluar");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "telusuri";
        game.position2 = "diDepanRumah";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void telusuri(){
        
        //position = "telusuri";
        ui.mainTextArea.setText("Kamu memutuskan untuk menelusuri rumuah tersebut!."
                + "\n\nDari tempat kamu berdiri, kamu bisa melihat sebuah lorong di depanmu, sebuah tangga yang menuju ke lantai 2 di kananmu, dan sebuah ruangan dengan pintu "
                + "\ntertutup di kirimu."
                + "\n\nApa yang ingin kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Masuk Lorong");
        ui.choice2.setText("Naik Ke Lantai 2");
        ui.choice3.setText("Buka Pintu");
        ui.choice4.setText("");
        
        game.position1 = "lorong";
        game.position2 = "lantai2";
        game.position3 = "pintu";
        game.position4 = "";
    }
    
    public void lantai1() {
        if (player.readBook == true) {
            ui.mainTextArea.setText("""
					Dari tempat kamu berdiri, kamu bisa melihat sebuah lorong di depanmu, sebuah tangga yang menuju ke lantai 2 di kananmu, dan sebuah ruangan dengan pintu\s
					terbuka di kirimu.
                    
                    Pintu depan terbuka.
                    
					Apa yang ingin kamu lakukan?
					""");
            ui.choice1.setText("Masuk Lorong");
            ui.choice2.setText("Naik Ke Lantai 2");
            ui.choice3.setText("Buka Pintu");
            ui.choice4.setText("Keluar");

            game.position1 = "lorong";
            game.position2 = "lantai2";
            game.position3 = "pintu";
            game.position4 = "keluar";
        }
        else if (player.readBook == false) {
            ui.mainTextArea.setText("Dari tempat kamu berdiri, kamu bisa melihat sebuah lorong di depanmu, sebuah tangga yang menuju ke lantai 2 di kananmu, dan sebuah ruangan dengan pintu "
                                    + "\ntertutup di kirimu."
                                    + "\n\nApa yang ingin kamu lakukan?");
            ui.choice1.setText("Masuk Lorong");
            ui.choice2.setText("Naik Ke Lantai 2");
            ui.choice3.setText("Buka Pintu");
            ui.choice4.setText("");

            game.position1 = "lorong";
            game.position2 = "lantai2";
            game.position3 = "pintu";
            game.position4 = "";
        }
    }

    public void pintu(){
        if (player.keyGet == true) {
            ui.mainTextArea.setText("Kamu membuka kunci pintunya dan masuk");
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.position1 = "ruangkunci";
            game.position2 = "";
            game.position3 = "";
            game.position4 = "";
        }

        else if (player.keyGet == false) {
            ui.mainTextArea.setText("Kamu mencoba membuka pintunya"
                                    + "\n\nPintunya terkunci");
            ui.choice1.setText("Masuk Lorong");
            ui.choice2.setText("Naik Ke Lantai 2");
            ui.choice3.setText("Buka Pintu");
            ui.choice4.setText("");

            game.position1 = "lorong";
            game.position2 = "lantai2";
            game.position3 = "pintu";
            game.position4 = "";
        }
    }

    public void keluar() {
        if (player.takeBook == true) {
            ui.mainTextArea.setText("""
				Kamu keluar dari rumah itu.
				Kamu telah menemukan informasi tentang siapa yang menghantui rumah itu.
				
			    Mengambil buku itu membuat Darto marah sehingga dia merasukimu.
				""");
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.position1 = "lose";
            game.position2 = "";
            game.position3 = "";
            game.position4 = "";
			player.kerasukan += 99;
        }
        else if (player.takeBook == false) {
            ui.mainTextArea.setText("""
				Kamu keluar dari rumah itu.
				
				Kamu telah menemukan informasi tentang siapa yang menghantui rumah itu.
				""");
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.position1 = "win";
            game.position2 = "";
            game.position3 = "";
            game.position4 = "";
        }
    }

    public void win() {
        String fontPath = "C:\\Users\\naufa\\Documents\\NetBeansProjects\\Game\\swingdevilDEMO.otf";
        ui.kerasukanNumber.setVisible(false);
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            Font customFontSized = customFont.deriveFont(Font.PLAIN, 85);
            ui.mainTextArea.setFont(customFontSized);
            ui.mainTextArea.setForeground(Color.yellow);
            ui.mainTextArea.setBounds(350, 450, 300, 150);
            ui.mainTextArea.setText("\n\nYOU WIN");
            ui.choice1.setText("");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
    }

    /////////<<<LANTAI2>>>///////////
    public void lantai2(){
        
        //position = "lantai2";
        ui.mainTextArea.setText("Kamu menaiki tangga tersebut...");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lantaivol2";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
     
    public void lantaivol2(){

        //position = "lantaivol2";
        if (!player.wereOnSecondFloor) {
            player.wereOnSecondFloor = true;
            ui.mainTextArea.setText("Kamu sudah tiba di lantai 2..."
                                    + "\n\nTiba-tiba pintu masuk rumah tertup dengan suara keras"
                                    + "\nKamu beripikir ini cukup aneh, padahal belakangan ini cuaca tidak pernah "
                                    + "\nmenghembuskan angin yang begitu kuat!."
                                    + "\n\nApa yang ingin kamu lakukan?");
        }
        else {
            ui.mainTextArea.setText("Kamu sudah tiba di lantai 2..."
                                    + "\n\nApa yang ingin kamu lakukan?");
        }
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Lihat Sekitar");
        ui.choice2.setText("Periksa ke Bawah");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lihatSekitar";
        game.position2 = "periksaPintu";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void lihatSekitar(){
        
        //position = "lihatSekitar";
        ui.mainTextArea.setText("Kamu memilih untuk melihat sekitar.."
                + "\n\nAda sebuah meja tepat di tengah-tengah ruangan"
                + "\nyang di atasnya ada sebuah kunci"
                + "\n\nApa yang akan kamu lakukan terhadap kunci tersebut?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Ambil");
        ui.choice2.setText("Abaikan");
        ui.choice3.setText("Lakukan Salto");
        ui.choice4.setText("");
        
        game.position1 = "ambil";
        game.position2 = "abaikan";
        game.position3 = "salto";
        game.position4 = "";
    }

    public void ambil(){
        if (!player.keyGet) {
            ui.mainTextArea.setText("""
                Kamu mengambil kunci tersebut lalu kembali ke lantai pertama.
                """);
            player.keyGet = true;
        }
        else {
            ui.mainTextArea.setText("""
                Kamu sudah mengambil kuncinya.
                """);
        }

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lantai1";


    }

    public void abaikan(){
        ui.mainTextArea.setText("""
                Kamu mengabaikan kunci tersebut lalu kembali ke lantai pertama.
                """);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lantai1";
    }

    public void salto(){
        ui.mainTextArea.setText("Kamu melakukan salto......"
                + "\n\nLalu kamu terjatuh, sehingga leher kamu patah");
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lose";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    /////////<<<END LANTAI2>>>///////////
    
    /////////<<<RUANG TERKUNCI>>>////////
    public void ruangkunci(){
        ui.mainTextArea.setText("Ruangannya gelap gulita.");
        ui.choice1.setText("Raba dinding");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "raba";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void raba(){
        ui.mainTextArea.setText("Kamu merasakan sesuatu yang bentuknya seperti tombol.");
        ui.choice1.setText("Nyalakan");
        ui.choice2.setText("Raba dinding");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "nyala";
        game.position2 = "rabaBad";
        game.position3 = "";
        game.position4 = "";
    }

    public void nyala(){
        ui.mainTextArea.setText("""
            Ruangan ini kosong melompong.
            
            Ada sebuah buku yang tergeletak di tengah-tengah ruangan.
            """);
        ui.choice1.setText("Ambil");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "buku";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void rabaBad(){
		player.kerasukan += 5;
        ui.kerasukanNumber.setText("Kerasukan: "+player.kerasukan);

        ui.mainTextArea.setText("""
            Kamu merasakan jari-jari di dinding.
            """);
        ui.choice1.setText("Kembali ke tombol");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "raba";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void buku(){
        ui.mainTextArea.setText("""
            Buku ini sangat ringan meskipun tebal sekali.
            """);
        ui.choice1.setText("Buka");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "bukuBuka";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void bukuBuka(){
        player.readBook = true;
        ui.mainTextArea.setText("""
            Buku ini berisi biografi seorang pria yang bernama Darto Sugeng Ikiopo.
            Ia ditusuk mati oleh istrinya sendiri setelah Darto ketahuan berselingkuh dengan tetangganya.
            
            Mungkin saja jiwa Darto masih bergentayangan di rumah ini.
            """);
        ui.choice1.setText("Taruh buku ke tempat semula");
        ui.choice2.setText("Bawa bukunya");
        ui.choice3.setText("");
        ui.choice4.setText("");

        System.out.println(player.readBook);

        game.position1 = "taruh";
        game.position2 = "bawa";
        game.position3 = "";
        game.position4 = "";
    }

    public void bawa(){
        player.takeBook = true;
        ui.mainTextArea.setText("""
            Kamu membawa bukunya denganmu.
            """);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lantai1";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void taruh(){
        ui.mainTextArea.setText("""
            Kamu menaruh bukunya ke tempat semula.
            """);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lantai1";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    /////////<<<END RUANG TERKUNCI>>>////////

    /////////<<<LORONG>>>///////////
    public void lorong(){
        
        //position = "lorong";
        ui.mainTextArea.setText("Kamu memasuki lorong tersebut. "
                + "\n\nKamu sudah berjalan di lorong tersebut selama 5 menit, kamu tidak pernah bisa menemukan ujungnya.");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lorong1";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void lorong1(){
        
        //position = "lorong1";
        ui.mainTextArea.setText("Kamu sudah berjalan selama lebih dari 10 menit.... "
                + "\n\nDi suasana yang gelap dan penuh debu, "
                + "\nkamu mendengar suara langkah kaki di belakangmu. Sepertinya langkah kaki \nitu mengerah kepadamu"
                + "\n\nApa yang akan kamu lakukan?");
        player.kerasukan += 3;
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Lari!");
        ui.choice2.setText("Tutup Mata");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lari";
        game.position2 = "tutupMata";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void lari(){
        //position = "lari";
        ui.mainTextArea.setText("Kamu memilih berlari menyelamatkan hidupmu."
                + "\n\nTapi semua itu belum berakhir, karena di hadapanmu sekarang"
                + "\nterdapat 3 lorong yang sangat gelap."
                + "\n\nApa yang akan kamu lakukan!");
        player.kerasukan -= 2;
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Lorong 1");
        ui.choice2.setText("Lorong 2");
        ui.choice3.setText("Lorong 3");
        ui.choice4.setText("");
        
        game.position1 = "lorongA1";
        game.position2 = "lorongA2";
        game.position3 = "lorongA3";
        game.position4 = "";
    }
    
    public void kembaliLorong(){
        //position = "lari";
        ui.mainTextArea.setText("Kamu kembali lagi di titik 3 lorong..."
                + "\n\nTapi kelihatannya, sesuatu yang mengejar kamu sebelumnya"
                + "\nsudah tidak bersuara. "
                + "\n\nApa yang ingin kamu lakukan?");
        
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Lorong 1");
        ui.choice2.setText("Lorong 2");
        ui.choice3.setText("Lorong 3");
        ui.choice4.setText("Periksa Belakang");
        
        game.position1 = "lorongA1";
        game.position2 = "lorongA2";
        game.position3 = "lorongA3";
        game.position4 = "periksaBelakang";
    }
    
    public void lorongA1(){
        //position = "lorongA1";
        ui.mainTextArea.setText("Kamu memasuki Lorong 1..."
                + "\n\nTerlihat gelap dan sunyi di dalamnya. "
                + "\nKamu merasa ada yang tidak beres."
                + "\n\nApa yang ingin kamu lakukan?");
     
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("periksa lebih lanjut");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "periksaA1";
        game.position2 = "kembaliLorong";
        game.position3 = "";
        game.position4 = "";
    }
    public void lorongA2(){
        //position = "lorongA2";
        ui.mainTextArea.setText("Kamu memasuki Lorong 2..."
                + "\n\nDi dalamnya, kamu melihat banyak goresan aneh di dinding."
                + "\n\nApa yang ingin kamu lakukan selanjutnya?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Periksa Sekitar");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "periksaA2";
        game.position2 = "kembaliA2";
        game.position3 = "";
        game.position4 = "";
    }
    public void lorongA3(){
        //position = "lorongA3";
        ui.mainTextArea.setText("Kamu memasuki Lorong 3..."
                + "\n\nTerlihat terang dan sepi di dalamnya."
                + "\n\nApa yang ingin kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Periksa Sekitar");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "periksaA3";
        game.position2 = "kembaliA2";
        game.position3 = "";
        game.position4 = "";
    }
    public void periksaA1(){
        ui.mainTextArea.setText("Kamu memeriksa area sekitar.."
                + "\n\nTetapi, di saat kamu sedang melihat-lihat, kamu merasa ngantuk"
                + "\n\nKamu pun terjatuh, lalu tertidur....");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lose";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    public void periksaA2(){
          //position = "periksaA2";
        ui.mainTextArea.setText("Kamu memeriksa area sekitar.."
                + "\n\nTetapi, di saat kamu sedang melihat-lihat, "
                + "\nkamu menemukan sebuah tumpukan mayat hewan yang berbau busuk."
                + "\n\nKamu pun mendengar sebuah langkah kaki dari arah depan."
                + "\n\nApa yang akan kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Maju dan Serang");
        ui.choice2.setText("Lari kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "majuSerang";
        game.position2 = "lariKembali";
        game.position3 = "";
        game.position4 = "";
    }
    public void periksaA3(){
         //position = "periksaA3";
        ui.mainTextArea.setText("Kamu memeriksa area sekitar.."
                + "\n\nTetapi, di saat kamu sedang melihat-lihat, "
                + "\nkamu menemukan sebuah pintu yang terbuka dengan lebar."
                + "\n\nApa yang akan kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Masuk Pintu");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "pintuLorong";
        game.position2 = "kembaliA2";
        game.position3 = "";
        game.position4 = "";
    }
    public void pintuLorong(){

        ui.mainTextArea.setText("Kamu masuk ke pintu.."
                + "\n\nKamu melihat dokumen yang tampak sudah rusak."
                + "\n\nApa yang akan kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Ambil Dokumen");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "ambilDokumen";
        game.position2 = "kembaliA3";
        game.position3 = "";
        game.position4 = "";
    }
    public void kembaliA3(){
        //position = "lorongA3";
        ui.mainTextArea.setText("Kamu  kembali ke Lorong 3..."
                + "\n\nApa yang ingin kamu lakukan?");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText("Masuk Pintu");
        ui.choice2.setText("Kembali");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "pintuLorong";
        game.position2 = "kembaliA2";
        game.position3 = "";
        game.position4 = "";
    }
    public void ambilDokumen(){
        ui.mainTextArea.setText("Kamu mengambil dokumen tersebut.."
                + "\n\nKamu melihat isi dari dokumen tersebut."
                + "\n\nTiba-tiba saja kamu terbangun dari tidur."
                + "\n\nkamupun tampak bingung!!");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "Ending";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    public void Ending(){
        ui.mainTextArea.setText("Kamupun sadar bahwa semua itu hanya mimpi "
                + "\n\nSelamat, kamu sudah menyelesaikan permasalahan dari rumah "
                + "\ntersebut");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "win";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    public void majuSerang(){

        ui.mainTextArea.setText("Kamu merasa muak dengan semua ini..."
                + "\n\nKamupun maju dengan penuh amarah memukul "
                + "\nmahkluk yang ada di depan kamu"
                + "\n\nTetapi, pukulan mu tidak berdampak apa-apa. "
                + "\nSeolah-olah sedang memukul angin"
                + "\n\nTiba-tiba saja pandangan mu memudar, lalu kamu tertidur....");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lose";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    public void lariKembali(){
        ui.mainTextArea.setText("Kamu berlari ke lorong dibelakang.."
                + "\n\nTetapi, di saat kamu kembali, kamu bertemu dengan mahkluk"
                + "\nyang mengejarmu sebelumnya....");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "lose";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    public void periksaBelakang(){

        ui.mainTextArea.setText("Kamu kembali untuk memeriksa kondisi lorong dibelakang.."
                + "\n\nTetapi, di saat kamu kembali, kamu bertemu dengan mahkluk"
                + "\nyang mengejarmu....");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lose";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void kembaliA2(){
        ui.mainTextArea.setText("Kamu kembali untuk memeriksa 2 lorong lainnya.."
                + "\n\nTetapi, di saat kamu kembali, kamu bertemu dengan mahkluk"
                + "\nyang mengejarmu....");

        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan );
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lose";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void tutupMata(){
        
        //position = "tutupMata";
        ui.mainTextArea.setText("Kamu menutup matamu "
                + "\ndan tidak menggerakan satu ototpun, \nberharap semuanya berakhir"
                + "\n\nTetapi.....");
        player.kerasukan += 17;
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan + " + 3 kerasukan");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lose";
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    /////////<<<END LORONG>>>///////////
   
    
    
    public void pulang(){
        
       // position = "pulang";
        ui.mainTextArea.setText("Kamu memutuskan untuk pulang, meninggalkan rumah yang misterius ini.\n\nNamun, ketika kamu berjalan menjauh, ada suara aneh yang terdengar dari \ndalam rumah.\n\nApa yang ingin kamu lakukan?");
       
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Kembali dan Cek");
        ui.choice2.setText("Tetap Pergi");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "diDepanRumah";
        game.position2 = "tetapPergi";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void penasaran() {
        
       // position = "penasaran";
        ui.mainTextArea.setText("Rasa penasara membuatmu ingin mengetahui napa yang terjadi di dalam \nrumah ini.\nNamun, ada perasaan aneh yang menggelitik di dalam pikiranmu.\n\nApa yang ingin kamu lakukan?");
        
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText("Masuk");
        ui.choice2.setText("Pulang");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "masukRumah";
        game.position2 = "pulang";
        game.position3 = "";
        game.position4 = "";
    }
    
    public void tetapPergi() {
        
       // position = "tetapPergi";
        ui.mainTextArea.setText("Kamu pergi jauh dari rumah itu dan pulang.\n\nAnehnya, saat di jalan pulang kamu berpapasan dengan rumah itu lagi.");
//        player.kerasukan += 1;
//        if(player.kerasukan >= 3){
//            ui.choice1.setText(">");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.position1 ="lose";
//            ui.choice2.setVisible(false);
//            ui.choice3.setVisible(false);
//            ui.choice4.setVisible(false);
//        }
        ui.kerasukanNumber.setText("Kerasukan : " + player.kerasukan);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        
        game.position1 = "lose";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    
    
    
    
    public void lose(){
	//position = "lose";
	String fontPath = "C:\\Users\\naufa\\Documents\\NetBeansProjects\\Game\\Zombie_Holocaust.ttf";
        //ui.mainTextArea.setText("Kamu terkena banyak kerasukan");
        ui.kerasukanNumber.setVisible(false);
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            ui.kerasukanNumber.setVisible(false);
            // Mengubah ukuran font sesuai kebutuhan
            Font customFontSized = customFont.deriveFont(Font.PLAIN, 85);
            ui.mainTextArea.setFont(customFontSized);
            ui.mainTextArea.setForeground(Color.red);
            ui.mainTextArea.setBounds(350, 450, 300, 150);
            ui.mainTextArea.setText("\n\nGAME OVER");

            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
    }


    }
    