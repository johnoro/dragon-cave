import { useState, useEffect } from 'react';
import {DragonService, DragonTypeService} from 'api/service/dragon';

const Cave = (props) => {
    const caveLoop = [
        "You approach the cave...",
        "It is dark and spooky...",
        "A large dragon jumps out in front of you! He opens his jaws and..."
    ];
    const [dragon, setDragon] = useState({});

    useEffect(() => {
        // perhaps only a call to DragonService here is needed?
        // (since the type behavior at the moment simply can correspond to the id)
        // unless some sort of 'dragon_actions' column or table is made to track that

        //     DragonService.retrieve(2)
        //         .then(({data: {id, typeId, name}}) => {
        //             DragonTypeService.retrieve(typeId)
        //                 .then(({data: {name:type}}) => {
        //                     setDragon({name, type});
        //                 })
        //         })
        
        console.log(dragon);
    }, [dragon]);

    return (
        <>
            {caveLoop.map((l, i) => (
                <p key={i}>{l}</p>
            ))}
            <p>
                {/* To later check dragon type */}
                {dragon
                    ? "Gobbles you down in one bite!"
                    : "Spits out a horde of treasure at your feet!"
                }
            </p>
        </>
    );
};

export default Cave;