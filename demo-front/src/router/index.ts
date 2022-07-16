import {createRouter, createWebHashHistory} from "vue-router"

import Home from "../components/home/Home.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: Home
    }
]

export const router = createRouter({
    history: createWebHashHistory(),
    routes: routes
})
