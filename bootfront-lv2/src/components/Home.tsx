import React from 'react';
import SidebarWithHeader from "./SidebarWithHeader";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";

import {FiHome, FiSettings, FiShoppingBag, FiStar, FiTrendingUp} from "react-icons/fi";
import HomePageContent from "./HomePageContent";
import Statistics from "./Statistics";

export const routes = [
    {
        path: "/",
        exact: true,
        name: 'Home',
        icon: FiHome,
        main: () => <HomePageContent />
    },
    {
        path: "/trending",
        name: 'Trending',
        icon: FiTrendingUp,
        main: () => <Statistics />
    },
    {
        path: "/products",
        name: 'Products',
        icon: FiShoppingBag,
        main: () => <h1> Product List </h1>
    },
    {
        path: "/favourites",
        name: 'Favourites',
        icon: FiStar,
        main: () => <h1> Faorites products </h1>
    },
    {
        path: "/settings",
        name: 'Settings',
        icon: FiSettings,
        main: () => <h1> Settings </h1>
    },
]

/*const LinkItems: Array<LinkItemProps> = [
    { name: 'Home', icon: FiHome },
    { name: 'Trending', icon: FiTrendingUp },
    { name: 'Products', icon: FiShoppingBag },
    { name: 'Favourites', icon: FiStar },
    { name: 'Settings', icon: FiSettings },
];*/

const Home = () => {
    return (
        <Router>
            <SidebarWithHeader>

                <Switch>
                    {routes.map((route, index) => (
                        // You can render a <Route> in as many places
                        // as you want in your app. It will render along
                        // with any other <Route>s that also match the URL.
                        // So, a sidebar or breadcrumbs or anything else
                        // that requires you to render multiple things
                        // in multiple places at the same URL is nothing
                        // more than multiple <Route>s.
                        <Route
                            key={index}
                            path={route.path}
                            exact={route.exact}
                            children={<route.main />}
                        />
                    ))}
                </Switch>
                
            </SidebarWithHeader>
        </Router>
    )
}

export default Home