

const Cave = () => {
    const caveLoop = [
        "You approach the cave...",
        "It is dark and spooky...",
        "A large dragon jumps out in front of you! He opens his jaws and..."
    ];

    return (
        <>
            {caveLoop.map(l => (
                <p>{l}</p>
            ))}
        </>
    );
};

export default Cave;