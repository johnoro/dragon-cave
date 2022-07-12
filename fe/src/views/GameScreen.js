// import { useState } from 'react';

// const GameScreen = () => {
//     const { isWaiting, setIsWaiting } = useState(true);
//     const { isStarting, setIsStarting } = useState(false);
//     const { isPlaying, setIsPlaying } = useState(false);

//     return (
//         <>
//             <BrowserRouter>
//                 <Routes>
//                     <Route path="" component={Game}/>
//                     <Route path="/cave" component={Cave} />
//                     <Route
//                         path="*"
//                         element={
//                             <main style={{ padding: "1rem" }}>
//                             <p>There's nothing here!</p>
//                             </main>
//                         }
//                     />
//                 </Routes>
//             </BrowserRouter>
//         </>
//     );
// }

// export default GameScreen;