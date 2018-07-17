import React from 'react';

class UserTable extends React.Component{

    render(){
        return(
            <div className="container-fluid">
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>STT</th>
                        <th>Username</th>
                        <th>Quantities of available tasks</th>
                        <th>More</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        );
    }
}

module.exports = UserTable;