import logo from 'assets/logo.svg';
import 'styles/App.css';
import Game from 'pages/Game';

const App = () => (
  <div className="App">
    <header className="App-header">
      <img src={logo} className="App-logo" alt="logo" />
      <Game />
    </header>
  </div>
);

export default App;