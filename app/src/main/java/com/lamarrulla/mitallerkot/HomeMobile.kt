package com.lamarrulla.mitallerkot

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.lamarrulla.mitallerkot.relay.compose.BorderAlignment
import com.lamarrulla.mitallerkot.relay.compose.CrossAxisAlignment
import com.lamarrulla.mitallerkot.relay.compose.MainAxisAlignment
import com.lamarrulla.mitallerkot.relay.compose.RelayContainer
import com.lamarrulla.mitallerkot.relay.compose.RelayContainerArrangement
import com.lamarrulla.mitallerkot.relay.compose.RelayContainerScope
import com.lamarrulla.mitallerkot.relay.compose.RelayImage
import com.lamarrulla.mitallerkot.relay.compose.RelayText
import com.lamarrulla.mitallerkot.relay.compose.RelayVector

/**
 * home-mobile
 *
 * This composable was generated from the UI Package 'examples_home_mobile'.
 * Generated code; do not edit directly*/


@Composable
fun ExamplesHomeMobile(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopAppBar(modifier = Modifier.rowWeight(1.0f)) {
            LeadingTrailingIcons(modifier = Modifier.rowWeight(1.0f)) {
                LeadingIcon {
                    Container {
                        StateLayerUHU {
                            Icon {
                                Icon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                }
                TrailingIcon {
                    TrailingIcon2 {
                        Container2 {
                            StateLayer2UHU {
                                Icon2 {
                                    Icon2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                        }
                    }
                    TrailingIcon3 {
                        Container3 {
                            StateLayer3UHU {
                                Icon3 {
                                    Icon3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                        }
                    }
                }
            }
            Headline(modifier = Modifier.rowWeight(1.0f)) {
                Headline1()
            }
        }
        Section1(modifier = Modifier.rowWeight(1.0f)) {
            TitleHeader(modifier = Modifier.rowWeight(1.0f)) {
                MiTableroUHU()
                IconButton {
                    Container4 {
                        StateLayer4UHU {
                            Icon4 {
                                Icon4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                }
            }
            Carousel(modifier = Modifier.rowWeight(1.0f)) {
                ItemVehiculo {
                    AvatarVehiculo {
                        MaterialSymbolsTransportationOutlineRounded(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 24.0.dp,
                                    y = 24.0.dp
                                )
                            )
                        ) {
                            Vector(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 0.000003814697265625.dp,
                                        y = 0.0.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }
                    Label(modifier = Modifier.rowWeight(1.0f))
                }
                ItemCredito {
                    AvatarCredito {
                        EntypoCredit(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 24.0.dp,
                                    y = 24.0.dp
                                )
                            )
                        ) {
                            Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    Label1(modifier = Modifier.rowWeight(1.0f))
                }
                ItemTaller {
                    AvatarTaller {
                        GameIconsMechanicGarage(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 24.0.dp,
                                    y = 24.0.dp
                                )
                            )
                        ) {
                            Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    LabelTaller(modifier = Modifier.rowWeight(1.0f))
                }
                ItemCitas {
                    AvatarCitas {
                        FluentMdl2DateTime(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 24.0.dp,
                                    y = 24.0.dp
                                )
                            )
                        ) {
                            Vector3UHU(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    LabelCitas(modifier = Modifier.rowWeight(1.0f))
                }
            }
        }
        Section2(modifier = Modifier.rowWeight(1.0f)) {
            TitleHeader1(modifier = Modifier.rowWeight(1.0f)) {
                Title()
                IconButton1 {
                    Container5 {
                        StateLayer5UHU {
                            Icon5 {
                                Icon5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                }
            }
            Carousel1(modifier = Modifier.rowWeight(1.0f)) {
                Item1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                ItemLast(modifier = Modifier.columnWeight(1.0f))
            }
            CarouselText(modifier = Modifier.rowWeight(1.0f)) {
                ItemText1(modifier = Modifier.rowWeight(1.0f)) {
                    TextContent(modifier = Modifier.rowWeight(1.0f)) {
                        Label4(modifier = Modifier.rowWeight(1.0f))
                        SupportingText(modifier = Modifier.rowWeight(1.0f))
                    }
                    IconButton2 {
                        Container6 {
                            StateLayer6UHU {
                                Icon6 {
                                    Icon6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                        }
                    }
                }
                ItemText2 {}
            }
        }
        Section4(modifier = Modifier.rowWeight(1.0f)) {
            TitleHeader2 {
                Title1()
                IconButton3 {
                    Container7 {
                        StateLayer7 {
                            Icon7 {
                                Icon7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                }
            }
            Content2(modifier = Modifier.rowWeight(1.0f)) {
                Carousel2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Card01 {
                        Background(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card01Synth {
                            Image()
                            TextContent1(modifier = Modifier.rowWeight(1.0f)) {
                                Title2(modifier = Modifier.rowWeight(1.0f))
                                Description(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card02 {
                        Background1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card02Synth {
                            Image1()
                            TextContent2(modifier = Modifier.rowWeight(1.0f)) {
                                Title3(modifier = Modifier.rowWeight(1.0f))
                                Description1(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card03 {
                        Background2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card03Synth {
                            Image2()
                            TextContent3(modifier = Modifier.rowWeight(1.0f)) {
                                Title4(modifier = Modifier.rowWeight(1.0f))
                                Description2(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card04 {
                        Background3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card04Synth {
                            Image3()
                            TextContent4(modifier = Modifier.rowWeight(1.0f)) {
                                Title5(modifier = Modifier.rowWeight(1.0f))
                                Description3(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card05 {
                        Background4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card05Synth {
                            Image4()
                            TextContent5(modifier = Modifier.rowWeight(1.0f)) {
                                Title6(modifier = Modifier.rowWeight(1.0f))
                                Description4(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card06 {
                        Background5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card06Synth {
                            Image5()
                            TextContent6(modifier = Modifier.rowWeight(1.0f)) {
                                Title7(modifier = Modifier.rowWeight(1.0f))
                                Description5(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                    Card07 {
                        Background6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            StateLayer6UHU(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        }
                        Card07Synth {
                            Image6()
                            TextContent7(modifier = Modifier.rowWeight(1.0f)) {
                                Title8(modifier = Modifier.rowWeight(1.0f))
                                Description6(modifier = Modifier.rowWeight(1.0f))
                            }
                        }
                    }
                }
            }
        }
        NavigationBar(modifier = Modifier.rowWeight(1.0f)) {
            NavItem1(modifier = Modifier.rowWeight(1.0f)) {
                IconContainer {
                    StateLayer8 {
                        Icon8 {
                            Icon8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                LabelText(modifier = Modifier.rowWeight(1.0f))
            }
            NavItem2(modifier = Modifier.rowWeight(1.0f)) {
                IconContainer1 {
                    StateLayer9 {
                        Icon9 {
                            Icon9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                LabelText1(modifier = Modifier.rowWeight(1.0f))
            }
            NavItem3(modifier = Modifier.rowWeight(1.0f)) {
                IconContainer2 {
                    StateLayer10 {
                        Icon10 {
                            Icon10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                LabelText2(modifier = Modifier.rowWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 412, heightDp = 972)
@Composable
private fun ExamplesHomeMobilePreview() {
    MaterialTheme {
        ExamplesHomeMobile()
    }
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerUHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}


@Composable
fun Container(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun LeadingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Icon2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.0.dp,
                top = 2.0.dp,
                end = 4.0.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer2UHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Container2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun TrailingIcon2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Icon3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.95001220703125.dp,
                top = 2.0.dp,
                end = 1.9499874114990234.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer3UHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Container3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun TrailingIcon3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TrailingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun LeadingTrailingIcons(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 4.0.dp,
            top = 8.0.dp,
            end = 4.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Headline1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mi Taller",
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.3333332824707032.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Headline(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun TopAppBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 24.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun MiTableroUHU(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mi Tablero",
        fontSize = 22.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.272727279663086.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Icon4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon3),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 4.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer4UHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}


@Composable
fun Container4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TitleHeader(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(48.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 2.0.dp,
                end = 0.0.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaterialSymbolsTransportationOutlineRounded(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun AvatarVehiculo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 1000.0,
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun Label(modifier: Modifier = Modifier) {
    RelayText(
        content = "Vehiculos",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemVehiculo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.421600341796875.dp,
                top = 2.399993896484375.dp,
                end = 12.578399658203125.dp,
                bottom = 2.400005340576172.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun EntypoCredit(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun AvatarCredito(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 1000.0,
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun Label1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mis Creditos",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemCredito(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.3446807861328125.dp,
                top = 2.8125.dp,
                end = 2.344696044921875.dp,
                bottom = 2.34375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun GameIconsMechanicGarage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun AvatarTaller(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 1000.0,
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun LabelTaller(modifier: Modifier = Modifier) {
    RelayText(
        content = "Vehículos en Taller",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemTaller(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector3UHU(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FluentMdl2DateTime(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun AvatarCitas(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 1000.0,
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun LabelCitas(modifier: Modifier = Modifier) {
    RelayText(
        content = "Citas Programadas",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemCitas(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Carousel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Section1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "Servicios",
        fontSize = 22.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.272727279663086.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Icon5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon4),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 4.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer5UHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}


@Composable
fun Container5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun IconButton1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TitleHeader1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(48.0.dp)
    )
}

@Composable
fun Item1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_item_1),
        radius = 28.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ItemLast(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_item_last),
        radius = 28.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(56.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Carousel1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 16.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(221.0.dp)
    )
}

@Composable
fun Label4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun SupportingText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Title",
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.25.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Icon6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 5.0.dp,
                end = 5.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer6UHU(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}


@Composable
fun Container6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 232,
            green = 222,
            blue = 248
        ),
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun IconButton2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun ItemText1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemText2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(56.0.dp).heightIn(48.0.dp, Dp.Infinity)
    )
}

@Composable
fun CarouselText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Section2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Title1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Section title",
        fontSize = 22.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.272727279663086.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Icon7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon6),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 4.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Container7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun IconButton3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TitleHeader2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(412.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun StateLayer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Background(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card01Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card01(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Background1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card02Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card02(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}


@Composable
fun Background2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card03Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card03(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}


@Composable
fun Background3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card04Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card04(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Background4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title6(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card05Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card05(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Background5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title7(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card06Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card06(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Background6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 230,
            blue = 240
        ),
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.examples_home_mobile_image),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Title8(modifier: Modifier = Modifier) {
    RelayText(
        content = "Artist",
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Description6(modifier: Modifier = Modifier) {
    RelayText(
        content = "Song",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TextContent7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Card07Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 8.0,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).alpha(alpha = 100.0f)
    )
}

@Composable
fun Card07(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 12.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Carousel2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        itemSpacing = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Content2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(187.0.dp)
    )
}

@Composable
fun Section4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Icon8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon7),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 4.0.dp,
            end = 20.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(64.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun IconContainer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 232,
            green = 222,
            blue = 248
        ),
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun LabelText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Label",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun NavItem1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 12.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Icon9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon8),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 4.0.dp,
            end = 20.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(64.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun IconContainer1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(32.0.dp)
    )
}

@Composable
fun LabelText1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Label",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun NavItem2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 12.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Icon10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.examples_home_mobile_icon9),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 4.0.dp,
            end = 20.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(64.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun IconContainer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(32.0.dp)
    )
}

@Composable
fun LabelText2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Label",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun NavItem3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 12.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 243,
            green = 237,
            blue = 247
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 8.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        radius = 28.0,
        strokeWidth = 8.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 202,
            green = 196,
            blue = 208
        ),
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}