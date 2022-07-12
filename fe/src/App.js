import { Outlet, Link } from 'react-router-dom';
import logo from 'assets/logo.svg';
import 'styles/App.css';

const App = () => (
  <div className="App">
    <header className="App-header">
      <img src={logo} className="App-logo" alt="logo" />
      <nav>
        <Link to='/intro'>Begin</Link>
      </nav>
      <Outlet />
      <br />
    </header>
  </div>
);

export default App;