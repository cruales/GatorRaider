package ufl.cs1.controllers;

import game.controllers.DefenderController;
import game.models.Defender;
import game.models.Game;

import java.util.List;

public final class StudentController implements DefenderController
{
	public void init(Game game) { }

	public void shutdown(Game game) { }

	public int[] update(Game game,long timeDue)
	{

		int[] actions = new int[Game.NUM_DEFENDER];
		//int[][] actions = new int[Game.NUM_DEFENDER][Game.NUM_DEFENDER];
		List<Defender> enemies = game.getDefenders();

		//Chooses a random LEGAL action if required. Could be much simpler by simply returning
		//any random number of all of the ghosts
		/*for(int i = 0; i < actions.length; i++)
		{
			Defender defender = enemies.get(i);
			List<Integer> possibleDirs = defender.getPossibleDirs();
			if (possibleDirs.size() != 0)
				actions[i]=possibleDirs.get(Game.rng.nextInt(possibleDirs.size()));
			else
				actions[i] = -1;
		}*/
		for(int i=0; i<actions.length; i++) {
			int attacker_x = game.getAttacker().getLocation().getX();
			actions[i] = attacker_x;
			//int attacker_y = game.getAttacker().getLocation().getY();
			//actions[i] = attacker_y;
		}
		return actions;
		//testing commits
	}
}
