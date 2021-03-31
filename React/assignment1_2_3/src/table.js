import * as React from 'react';

 
const Data = [
    {
        name:"Teja",
        job:"Developer"
    }
    
    ];

    class Table extends React.Component {
    
      constructor() {
        super();
        this.state = {
          data: Data
        };
        this.handleSubmit = this.handleSubmit.bind(this);
      }
    
      handleSubmit(e) {
        e.preventDefault();
        
        const { data } = this.state,
        name = this.refs.name.value,
        job = this.refs.job.value;
        this.setState({
          data: [...data, {
            name,
            job
          }]
        }, () => {
          this.refs.name.value = '';
          this.refs.job.value = '';
        });
      }
      handleItemDeleted(i) {
        var data = this.state.data;
    
       data.splice(i, 1);
    
        this.setState({
          data: data
        });
      }
      renderRows() {
        var context = this;
    
        return  this.state.data.map(function(o, i) {
                  return (
                    <tr key={"data-" + i}>
                      <td>
                        {o.name}
                      </td>
                      <td>
                          {o.job}
                      </td>
                      <td>
                        <button
                          onClick={context.handleItemDeleted.bind(context, i)}
                        >
                          Delete
                        </button>
                      </td>
                    </tr>
                  );
                });
      }
    
      render() {
        const { data} = this.state;
        console.log('message',this.state.data);
        
        return ( 
         <div>
             <table className="">
          <thead>
            <tr>
              <th>
                Name
              </th>
              <th>
               Job
              </th>
              <th>
                Remove
              </th>
            </tr>
          </thead>
          <tbody>
            {this.renderRows()}
          </tbody>
        </table>
        <hr/>
            <h2>Add New Employee</h2>
            <form onSubmit={this.handleSubmit}>
              <label>Name</label>
              <input type="text" ref="name" placeholder="name" / >
                <br></br>
              <label>Job</label>
              <input type="text" ref="job" placeholder="Job"/ >
                <br></br>
              <button type="submit">Submit</button>
            </form>
            
          </div>
        ) 
      }
    }
export {Table} ;   