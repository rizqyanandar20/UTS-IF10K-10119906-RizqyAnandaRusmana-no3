/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119906.rizqyanandarusmana.no3;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Program  : UTS-no3.
 */

public class UTS12018 {
    public static void main(String[] args) {
        
        Rnb blues = new Rnb();
        blues.genreBlues("Jimmy Hendrik");
        
        Rnb jazz = new Rnb();
        jazz.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockability rockability = new Rockability();
        rockability.genreRockability("Elvis Presley");
        
        HardRock progressiveRock = new HardRock();
        progressiveRock.genreProgressiveRock("DreamTheater");
        
        HardRock psycehedellic = new HardRock();
        psycehedellic.genrePsycehedellic("The Doors");
        
        HardRock popRock = new HardRock();
        popRock.genrePopRock("Kiss");
        
        Metal punk = new Metal();
        punk.genrePunk("MXPX");
        
        Metal heavyMetal = new Metal();
        heavyMetal.genreHeavyMetal("METALLICA");
        
        Grindcore grindcore = new Grindcore();
        grindcore.genreGrindcore("Mesin Tempur");
        
        DeathMetal deathMetal = new DeathMetal();
        deathMetal.genreDeathMetal("JASAD");
        
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal blackMetal = new BlackMetal();
        blackMetal.genreBlackMetal("Behemoth");
        
        NewSkul newSkul = new NewSkul();
        newSkul.genreNewSkul("HATEBREED");
    }
}
