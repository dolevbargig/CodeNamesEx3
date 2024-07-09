package EngineModule.src.EnginePackage;
import GamePackage.*;

public interface Engine {

    public Game loadXmlFile (String filename);

    public void showGameMenu();

    public void showLoadedGameInfo(Game currentGame);

    public void startGame();

    public void playTurn(Team teamTurn,String hint,int numOfWordsToGuess);

    public boolean playTurn(Team teamTurn ,int wordIndex,BooleanWrapper gameOver);

    public void printGameStats(Game currentGame,boolean team1Turn);


}
