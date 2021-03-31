import React from 'react';
import { Header } from '../../Components/Header';
import { WeatherDashboard } from '../../Components/Weather/WeatherDashboard';

const App = () => (
    <div>
        <Header title='Weather' />
        <div className="mt-lg-5">
            <div className="col-lg-6 p-0 mx-auto">
                <WeatherDashboard />
            </div>       
        </div>
    </div>
);

export default App;