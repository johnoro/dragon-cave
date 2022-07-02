import { intro } from 'components/game';
import { Formik, Form, Field, ErrorMessage } from 'formik';

const Game = () => {
    const {Cave, Game} = intro;
    return (
        <>
            <Game />
            <br />
            <Cave />
        </>
    );
}

export default Game;