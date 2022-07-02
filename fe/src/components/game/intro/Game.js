

const Intro = () => {
    const intro = [
        "You are in a land full of dragons. In front of you,",
        "you see two caves. In one cave, the dragon is friendly",
        "and will share his treasure with you. The other dragon",
        "is greedy and hungry and will eat you on sight.",
        "Which cave will you go into? (1 or 2)"
    ];

    return (
        <>
            {intro.map(l => (
                <p>{l}</p>
            ))}
        </>
    );
};

export default Intro;