package ru.garf.controller;


import ru.garf.model.Metod;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput {

    static boolean shiftFlag;

    public static KeyListener keyboardListener = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode()==16) shiftFlag=true;

        }

        public void keyReleased(KeyEvent e) {

            int KC=e.getKeyCode();


            //nums
            if(KC>=48&&KC<=57){
                WindowController.pressNumButton(KC-48);
            }
            if(KC>=96&&KC<=105){
                WindowController.pressNumButton(KC-96);
            }

            // metod + - * / =
            if (KC==16) shiftFlag=false;

            if ((KC==61&&shiftFlag)||KC==107){
                WindowController.pressMetodButton(Metod.sum);
            }

            if (KC==109||KC==45){
                WindowController.pressMetodButton(Metod.unsum);
            }

            if (KC==106){
                WindowController.pressMetodButton(Metod.mult);
            }

            if (KC==111){
                WindowController.pressMetodButton(Metod.dev);
            }

            if ((KC==61&&!shiftFlag)||KC==10){
                WindowController.pressResultButton();
            }


            // Backspace, Del, dot
            if (KC==110||KC==47||KC==47){
                WindowController.pressDotButton();
            }

            if (KC==8){
                WindowController.pressBackButton();
            }

            if (KC==127){
                WindowController.pressClearAllButton();
            }

        }

    };
}





