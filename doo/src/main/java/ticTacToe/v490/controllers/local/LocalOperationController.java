package ticTacToe.v490.controllers.local;

import ticTacToe.v490.controllers.OperationController;
import ticTacToe.v490.controllers.OperationControllerVisitor;
import ticTacToe.v490.controllers.local.LocalController;
import ticTacToe.v490.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
