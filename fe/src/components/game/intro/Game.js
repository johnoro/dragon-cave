import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { Formik, Form, Field, ErrorMessage } from 'formik';

const Intro = () => {
    const intro = [
        "You are in a land full of dragons. In front of you,",
        "you see two caves. In one cave, the dragon is friendly",
        "and will share his treasure with you. The other dragon",
        "is greedy and hungry and will eat you on sight.",
        "Which cave will you go into? (1 or 2)"
    ];
    const numValidOptions = 2;

    const [caveId, setCaveId] = useState(0);
    
    const navigate = useNavigate();

    const onSubmit = ({caveNumber}) => {
        setCaveId(caveNumber);
        navigate(`/cave/${caveId}`);
    };

    const validate = ({caveNumber}) => {
        let errors = {};

        if (caveNumber < 0 || caveNumber > numValidOptions) {
            errors.caveNumber = `Enter a number between 1 and ${numValidOptions}`;
        }

        return errors;
    };

    return (
        <>
            {intro.map((l, i) => (
                <p key={i}>{l}</p>
            ))}
            <Formik
                initialValues={{caveNumber: caveId}}
                onSubmit={onSubmit}
                validateOnChange={false}
                validateOnBlur={false}
                validate={validate}
                enableReinitialize={true}
            >
                {
                    () => (
                        <Form>
                            <ErrorMessage name="caveNumber" component="div" className="alert alert-warning" />
                            <fieldset className='form-group'>
                                <label>Cave Number</label>
                                <br />
                                <Field className='form-control' type='number' name='caveNumber' />
                            </fieldset>
                            <button className='btn btn-success' type='submit'>Enter Cave</button>
                        </Form>
                    )
                }
            </Formik>
        </>
    );
};

export default Intro;