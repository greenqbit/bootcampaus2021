import * as React from "react"
import {
  ChakraProvider,
  theme,
} from "@chakra-ui/react"
import Home from "./components/home";

export const App = () => (
  <ChakraProvider theme={theme}>

    <Home />
  </ChakraProvider>
)
