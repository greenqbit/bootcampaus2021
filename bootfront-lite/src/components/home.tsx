import React from "react";
import SidebarWithHeader from "./SidebarWithHeader";
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import {FiHome, FiSettings, FiShoppingBag, FiStar, FiTrendingUp} from "react-icons/fi";
import ProductList from "./ProductList";
import HomePageContent from "./HomePageContent";
import Statistics from "./Statistics";
import ThreeTierPricing from "./Pricing";
import SocialProfileWithImage from "./SocialProfileWithImage";

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
        main: () => <ProductList />
    },
    {
        path: "/favourites",
        name: 'Favourites',
        icon: FiStar,
        main: () => <ThreeTierPricing />
    },
    {
        path: "/settings",
        name: 'Settings',
        icon: FiSettings,
        main: () => <SocialProfileWithImage />
    }
]

const Home = () => {
    return (
        <Router>
            <SidebarWithHeader>
                <Switch>
                    {routes.map((route, index) => (
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