// ************************************************************************** //
//                                                                            //
//                                                  .--.                      //
//   Broom.java                                  __/ o  ".                    //
//                                                 ),    "-.                  //
//   By: dany <github.com/dgerard42>               |;;,      "-._             //
//                                                 ';;;,,    ",_ "=-._        //
//   Created: 2020/01/30 14:54:59 by dany            ':;;;;,,..-``"-._`"-.    //
//   Updated: 2020/01/30 15:15:39 by dany              _/_/`           `'"`   //
//                                                                            //
// ************************************************************************** //

public class ClickyBall extends WindowController {

    public void onMouseDrag(Location point){
        theBall.moveTo(point);
    }
    public void onMouseRelease(Location point){
        theBall.hide();
    }

}
