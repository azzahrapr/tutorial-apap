import React from 'react';
import List from "./components/List";
import dummyItems from "./items.json";
// import logo from './logo.svg';
// import './App.css';

export default class App extends React.Component {
  state = {
    favItems: [],
    newState: false
  };

  // handleChange = () => this.setState({ checked: !this.state.checked});

  showFavorit = () =>{
    this.setState(prevState => ({
      newState : !prevState.newState
    }))
  };

  handleItemClick1 = item =>{
    const newItems = [...this.state.favItems];
    const newItem = { ...item };

    const targetInd = newItems.findIndex(it => it.id === newItem.id);
    if (targetInd < 0) newItems.push(newItem);
    else newItems.splice(targetInd, 1);
    this.setState({favItems: newItems});
  };

  handleItemClick2 = item =>{
    const newItems = [...this.state.favItems];
    const newItem = { ...item };

    const targetInd = newItems.findIndex(it => it.id === newItem.id);
    if (targetInd < 0) newItems.push(newItem);
    // else newItems.splice(targetInd, 1);
    this.setState({favItems: newItems});
  };

  render() {
    const { favItems, newState } = this.state
    // const content = this.state.checked
    // ? <div> Content </div>
    //   : null;
    return (
      <div className="container-fluid">
        <h1 className="text-center">
          Welcome!
          <small>Class-based</small>
        </h1>

        <p className="text-center"><input type = "checkbox" onClick={this.showFavorit}/>Show Favorite</p>

      {/* <div>
        <div>
          <label>Check</label>
          <input 
            type="checkbox" 
            checked={ this.state.checked } 
            onChange={ this.handleChange } />
        </div>
        { content }
    </div>; */}

        <div className="container pt-3">
          <div className="row">
            <div className="col-sm">
              <List
                title="Our Menu"
                items={dummyItems}
                onItemClick={this.handleItemClick2}
                checkBox = {false}
              />
            </div>
            <div className={`col-sm ${newState ? "d-block" : "d-none"}`}>
              <List
                 title="My Favorite"
                 items={favItems}
                 onItemClick={this.handleItemClick1}
                 checkBox={true}
              />
            </div>
          </div>
        </div>
      </div>
    )
  }
}